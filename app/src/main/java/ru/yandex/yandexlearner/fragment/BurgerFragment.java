package ru.yandex.yandexlearner.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daprlabs.cardstack.SwipeDeck;

import java.util.ArrayList;

import ru.yandex.yandexlearner.MainActivity;
import ru.yandex.yandexlearner.R;
import ru.yandex.yandexlearner.adapter.BurgerSwipeDeckAdapter;

/**
 * Created by user on 23.07.16.
 */
public class BurgerFragment extends Fragment {

    private MainActivity mMainActivity;

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
        View view = inflater.inflate(R.layout.burger_swipe_layout, container, false);
        SwipeDeck cardStack = (SwipeDeck) view.findViewById(R.id.swipe_deck);

        final ArrayList<String> testData = new ArrayList<>();
        testData.add("0");
        testData.add("1");
        testData.add("2");
        testData.add("3");
        testData.add("4");

        final BurgerSwipeDeckAdapter adapter = new BurgerSwipeDeckAdapter(testData, getActivity());
        cardStack.setAdapter(adapter);

        cardStack.setEventCallback(new SwipeDeck.SwipeEventCallback() {
            @Override
            public void cardSwipedLeft(int position) {
                Log.i("YAPP", "card was swiped left, position in adapter: " + position);
            }

            @Override
            public void cardSwipedRight(int position) {
                Log.i("YAPP", "card was swiped right, position in adapter: " + position);
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

    @Override
    public void onPause() {
        super.onPause();
        mMainActivity.setHiddenToolbar(false);
    }
}
