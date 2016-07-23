package ru.yandex.yandexlearner.pojo;

import com.bignerdranch.expandablerecyclerview.Model.ParentListItem;

import java.util.List;

public class ExerciseItem implements ParentListItem {

    private String mName;
    private List<ExerciseItemInfo> mExerciseItemInfos;


    private int mColor;
    private int mDefColor;

    public ExerciseItem(String name, int color, List<ExerciseItemInfo> exerciseItemInfos) {
        mName = name;
        mColor = color;
        mExerciseItemInfos = exerciseItemInfos;
    }

    public String getName() {
        return mName;
    }

    @Override
    public List<?> getChildItemList() {
        return mExerciseItemInfos;
    }

    @Override
    public boolean isInitiallyExpanded() {
        return false;
    }

    public int getColor() {
        return mColor;
    }
}
