package com.yyz.dao;

import com.yyz.domain.Student;

import java.util.List;
import java.util.Map;

/**
 * Created by yangyeze on 2017/4/20.
 */
public interface StudentDao {
    public List<Student> getList();
    public Student getById(int id);
    public boolean save(Student student);

}
