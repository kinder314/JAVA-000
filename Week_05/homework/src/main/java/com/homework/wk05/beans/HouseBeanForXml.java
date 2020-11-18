package com.homework.wk05.beans;

import com.homework.wk05.beans.parts.Door;
import com.homework.wk05.beans.parts.Window;

import java.util.List;

public class HouseBeanForXml {

    private Door door;
    private List<Window> windowList;

    public void setDoor(Door door) {
        this.door = door;
    }

    public void setWindowList(List<Window> windowList) {
        this.windowList = windowList;
    }
}
