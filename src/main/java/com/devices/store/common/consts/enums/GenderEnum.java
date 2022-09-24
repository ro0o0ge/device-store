package com.devices.store.common.consts.enums;

public enum GenderEnum {

    FEMALE(0), MALE(1);

    private int gender;

    GenderEnum(int gender) {
        this.gender = gender;
    }

    public int getGender() {
        return gender;
    }

}
