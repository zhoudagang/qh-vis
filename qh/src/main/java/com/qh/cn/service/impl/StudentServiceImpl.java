package com.qh.cn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qh.cn.entity.Student;
import com.qh.cn.mapper.StudentMapper;
import com.qh.cn.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> queryStudentList() {
        return studentMapper.selectList(null);
    }

}
