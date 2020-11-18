package com.homework.wk05.beans;

import com.homework.wk05.beans.parts.Door;
import com.homework.wk05.beans.parts.Window;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class HouseBeanForAnnotation {

    @Resource
    private Door door;
    @Resource
    private List<Window> windowList;
}
