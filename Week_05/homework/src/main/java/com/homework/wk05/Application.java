package com.homework.wk05;

import com.homework.wk05.beans.HouseBeanForConfiguration;
import com.homework.wk05.beans.parts.Door;
import com.homework.wk05.beans.parts.Window;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Configuration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public HouseBeanForConfiguration houseBeanForConfiguration() {
        HouseBeanForConfiguration bean = new HouseBeanForConfiguration();
        bean.setDoor(this.door());
        bean.setWindowList(this.windowList());

        return bean;
    }

    @Bean
    public Door door() {
        return new Door();
    }

    @Bean
    public List<Window> windowList() {
        List<Window> list = new ArrayList<Window>();
        list.add(new Window("front"));
        list.add(new Window("back"));
        return list;
    }
}
