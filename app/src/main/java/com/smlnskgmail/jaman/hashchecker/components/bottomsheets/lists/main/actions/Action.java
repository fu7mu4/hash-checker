package com.smlnskgmail.jaman.hashchecker.components.bottomsheets.lists.main.actions;

import com.smlnskgmail.jaman.hashchecker.R;
import com.smlnskgmail.jaman.hashchecker.components.bottomsheets.lists.base.ListItemMarker;
import com.smlnskgmail.jaman.hashchecker.components.bottomsheets.lists.main.actions.types.UserActionType;

public enum Action implements ListItemMarker {

    TEXT(R.string.common_text, R.drawable.ic_from_text, UserActionType.ENTER_TEXT),
    FILE(R.string.common_file, R.drawable.ic_file, UserActionType.SEARCH_FILE),
    GENERATE(R.string.action_generate, R.drawable.ic_generate, UserActionType.GENERATE_HASH),
    COMPARE(R.string.action_compare, R.drawable.ic_compare, UserActionType.COMPARE_HASHES);

    private int titleResId;
    private int iconResId;

    private UserActionType userActionType;

    Action(int titleResId, int iconResId, UserActionType userActionType) {
        this.titleResId = titleResId;
        this.iconResId = iconResId;
        this.userActionType = userActionType;
    }

    @Override
    public int getTitleTextResId() {
        return titleResId;
    }

    @Override
    public int getPrimaryIconResId() {
        return iconResId;
    }

    @Override
    public int getAdditionalIconResId() {
        return -1;
    }

    public UserActionType getUserActionType() {
        return userActionType;
    }

}