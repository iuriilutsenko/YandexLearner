package ru.yandex.yandexlearner.viewholder;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;

import ru.yandex.yandexlearner.MainActivity;
import ru.yandex.yandexlearner.R;
import ru.yandex.yandexlearner.fragment.BurgerFragment;
import ru.yandex.yandexlearner.pojo.ExerciseItemInfo;

public class ExerciseItemInfoViewHolder extends ChildViewHolder implements View.OnClickListener{

    private TextView mIngredientTextView;
    private Context mContext;

    public ExerciseItemInfoViewHolder(View itemView, Context context) {
        super(itemView);
        itemView.setOnClickListener(this);
        mIngredientTextView = (TextView) itemView.findViewById(R.id.ingredient_textview);
        mContext = context;
    }

    public void bind(ExerciseItemInfo exerciseItemInfo) {
        mIngredientTextView.setText(exerciseItemInfo.getName());
    }


    @Override
    public void onClick(View v) {
        Log.d("YAPP", "new Burger");
        ((MainActivity) mContext).getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_frame, new BurgerFragment(), "burgerFragment")
                .addToBackStack(null)
                .commit();
    }
}
