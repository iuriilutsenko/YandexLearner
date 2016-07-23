package ru.yandex.yandexlearner.viewholder;

import android.view.View;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;

import ru.yandex.yandexlearner.R;
import ru.yandex.yandexlearner.pojo.ExerciseItemInfo;

public class ExerciseItemInfoViewHolder extends ChildViewHolder {

    private TextView mIngredientTextView;

    public ExerciseItemInfoViewHolder(View itemView) {
        super(itemView);
        mIngredientTextView = (TextView) itemView.findViewById(R.id.ingredient_textview);
    }

    public void bind(ExerciseItemInfo exerciseItemInfo) {
        mIngredientTextView.setText(exerciseItemInfo.getName());
    }
}
