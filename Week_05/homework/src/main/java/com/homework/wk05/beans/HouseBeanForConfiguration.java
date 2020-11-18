package com.homework.wk05.beans;

import com.homework.wk05.beans.parts.Door;
import com.homework.wk05.beans.parts.Window;

import java.util.List;

public class HouseBeanForConfiguration {
    private List<Window> windowList;
    private Door door;

    public void setDoor(Door door) {
        this.door = door;
    }

    public void setWindowList(List<Window> windowList) {
        this.windowList = windowList;
    }
}
