package ru.yandex.yandexlearner.viewholder;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;

import ru.yandex.yandexlearner.R;
import ru.yandex.yandexlearner.pojo.ExerciseItem;

public class ExerciseItemViewHolder extends ParentViewHolder {

    private TextView mRecipeTextView;
    private LinearLayout mLayout;

    private ExerciseItem mExerciseItem;
    public ExerciseItemViewHolder(View itemView) {
        super(itemView);
        mRecipeTextView = (TextView) itemView.findViewById(R.id.recipe_textview);
        mLayout = (LinearLayout) itemView.findViewById(R.id.exercise_menu_item);
    }

    public void bind(ExerciseItem exerciseItem) {
        mExerciseItem = exerciseItem;
        mRecipeTextView.setText(exerciseItem.getName());
    }

    @SuppressLint("NewApi")
    @Override
    public void setExpanded(boolean expanded) {
        super.setExpanded(expanded);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
        }
    }

    @Override
    public void onExpansionToggled(boolean expanded) {
        super.onExpansionToggled(expanded);
        if (expanded) {
            mLayout.setBackgroundColor(mExerciseItem.getColor());
        }else {

        }



        /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            RotateAnimation rotateAnimation;
            if (expanded) { // rotate clockwise
                 rotateAnimation = new RotateAnimation(ROTATED_POSITION,
                        INITIAL_POSITION,
                        RotateAnimation.RELATIVE_TO_SELF, 0.5f,
                        RotateAnimation.RELATIVE_TO_SELF, 0.5f);
            } else { // rotate counterclockwise
                rotateAnimation = new RotateAnimation(-1 * ROTATED_POSITION,
                        INITIAL_POSITION,
                        RotateAnimation.RELATIVE_TO_SELF, 0.5f,
                        RotateAnimation.RELATIVE_TO_SELF, 0.5f);
            }

            rotateAnimation.setDuration(200);
            rotateAnimation.setFillAfter(true);
        }*/
    }
}
