package com.yyz.service;

import com.yyz.dao.StudentDao;
import com.yyz.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

/**
 * Created by yangyeze on 2017/4/20.
 */
@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;
    @Autowired
    private Student student;
    private String pre ;

    public StudentService() {
    }

    public StudentService(String pre) {
        this.pre = pre;
    }

    public void save(){
        studentDao.save(student);
    }
    public List<Student> getAll(){
        return studentDao.getList();
    }
//    @PreDestroy
//    public void log()
//    {
//        System.out.println("bean destory");
//    }
//    @PostConstruct
//    public void postC(){
//        System.out.println("post c");
//    }
}
