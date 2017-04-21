package com.yyz.dao;

import com.yyz.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangyeze on 2017/4/20.
 */
@Component
public class StudenDaoImpl  implements StudentDao{
//    @Autowired
//    private Student student;
    @Override
    public List<Student> getList() {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"zhansan",false,1));
        return null;
    }

    @Override
    public Student getById(int id) {
//        System.out.println(student);
        return null;
    }

    @Override
    public boolean save(Student student) {
        System.out.println(student);
        return false;
    }
}
