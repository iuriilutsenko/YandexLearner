package ru.yandex.yandexlearner.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.bignerdranch.expandablerecyclerview.Adapter.ExpandableRecyclerAdapter;
import com.bignerdranch.expandablerecyclerview.Model.ParentListItem;

import java.util.List;

import ru.yandex.yandexlearner.R;
import ru.yandex.yandexlearner.pojo.ExerciseItemInfo;
import ru.yandex.yandexlearner.pojo.ExerciseItem;
import ru.yandex.yandexlearner.viewholder.ExerciseItemInfoViewHolder;
import ru.yandex.yandexlearner.viewholder.ExerciseItemViewHolder;

public class ExerciseAdapter extends ExpandableRecyclerAdapter<ExerciseItemViewHolder, ExerciseItemInfoViewHolder> {

    private LayoutInflater mInflator;
    private Context mContext;

    public ExerciseAdapter(Context context, @NonNull List<? extends ParentListItem> parentItemList) {
        super(parentItemList);
        mInflator = LayoutInflater.from(context);
        mContext = context;
    }

    @Override
    public ExerciseItemViewHolder onCreateParentViewHolder(ViewGroup parentViewGroup) {
        View recipeView = mInflator.inflate(R.layout.exercise_menu_item_view, parentViewGroup, false);
        return new ExerciseItemViewHolder(recipeView);
    }

    @Override
    public ExerciseItemInfoViewHolder onCreateChildViewHolder(ViewGroup childViewGroup) {
        View ingredientView = mInflator.inflate(R.layout.exercise_info_menu_item_view, childViewGroup, false);
        return new ExerciseItemInfoViewHolder(ingredientView, mContext);
    }

    @Override
    public void onBindParentViewHolder(ExerciseItemViewHolder exerciseItemViewHolder, int position, ParentListItem parentListItem) {
        ExerciseItem exerciseItem = (ExerciseItem) parentListItem;
        exerciseItemViewHolder.bind(exerciseItem);
    }

    @Override
    public void onBindChildViewHolder(ExerciseItemInfoViewHolder exerciseItemInfoViewHolder, int position, Object childListItem) {
        ExerciseItemInfo exerciseItemInfo = (ExerciseItemInfo) childListItem;
        exerciseItemInfoViewHolder.bind(exerciseItemInfo);
    }
}
