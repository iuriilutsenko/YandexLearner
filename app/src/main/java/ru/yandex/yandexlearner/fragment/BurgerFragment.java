package ru.yandex.yandexlearner.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.daprlabs.cardstack.SwipeDeck;

import java.util.ArrayList;

import ru.yandex.yandexlearner.MainActivity;
import ru.yandex.yandexlearner.R;
import ru.yandex.yandexlearner.words.WordStorage;
import ru.yandex.yandexlearner.adapter.BurgerSwipeDeckAdapter;

/**
 * Created by user on 23.07.16.
 */
public class BurgerFragment extends Fragment {

    private MainActivity mMainActivity;

    private final int amountOfCards = 10;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.d("YAPP", "new Burger");
        super.onActivityCreated(savedInstanceState);
        mMainActivity = ((MainActivity) getActivity());
        mMainActivity.setHiddenToolbar(true);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        WordStorage wordStorage = new WordStorage();

        View view = inflater.inflate(R.layout.burger_swipe_layout, container, false);
        SwipeDeck cardStack = (SwipeDeck) view.findViewById(R.id.swipe_deck);

        final ArrayList<String> testData = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            testData.add(wordStorage.getRandomEnglishWord());
        }

        final BurgerSwipeDeckAdapter adapter = new BurgerSwipeDeckAdapter(testData, getActivity());
        cardStack.setAdapter(adapter);

        cardStack.setLeftImage(R.id.left_image);
        cardStack.setRightImage(R.id.right_image);

        final ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progress_bar);


        cardStack.setEventCallback(new SwipeDeck.SwipeEventCallback() {
            @Override
            public void cardSwipedLeft(int position) {
                Log.i("YAPP", "card was swiped left, position in adapter: " + position);
                progressBar.setProgress(position+1);
                interruptWorking(position);
            }

            @Override
            public void cardSwipedRight(int position) {
                Log.i("YAPP", "card was swiped right, position in adapter: " + position);
                progressBar.setProgress(position+1);
                interruptWorking(position);
            }

            @Override
            public void cardsDepleted() {
                Log.i("YAPP", "no more cards");
            }

            @Override
            public void cardActionDown() {

            }

            @Override
            public void cardActionUp() {

            }
        });
        return view;
    }

    private void interruptWorking(int position) {
        if (position + 1 >= amountOfCards) {
            getFragmentManager().popBackStack();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mMainActivity.setHiddenToolbar(false);
    }
}
