package com.example.androidworkshoplistview;

import java.io.Serializable;

public class Person implements Serializable {
    private String name, birthday, sex;

    public Person(String name, String birthday, String sex) {
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
