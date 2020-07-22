package com.qianshe.controller;

import com.qianshe.domain.Student;
import com.qianshe.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @RequestMapping("hello")
    public String SayHi() {
        return "你好，大哥";
    }

    @Autowired
    StudentService studentService;

    @RequestMapping("find")
    public List<Student> find(){
        return studentService.findStudent();
    }
}
