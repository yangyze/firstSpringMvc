package com.yyz.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by yangyeze on 2017/4/20.
 */
@Component
public class Student {
    private Integer id;
    private String name;
    private boolean iSganbu;
    private Integer sex;

    public Student() {
    }

    public Student(@Value("1") Integer id,@Value("1") String name,@Value("1") boolean iSganbu,@Value("1") Integer sex) {
        this.id = id;
        this.name = name;
        this.iSganbu = iSganbu;
        this.sex = sex;
    }

    @Override

    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", is_ganbu=" + iSganbu +
                ", sex=" + sex +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getSex() {
        return sex;
    }

    public boolean isiSganbu() {
        return iSganbu;
    }

    public void setiSganbu(boolean iSganbu) {
        this.iSganbu = iSganbu;
    }
}
