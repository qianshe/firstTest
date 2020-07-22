package com.qianshe.service;

import com.qianshe.domain.Student;
import com.qianshe.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired(required = false)
    StudentMapper studentMapper;

    public List<Student> findStudent() {
        return studentMapper.selectStudent();
    }
}
