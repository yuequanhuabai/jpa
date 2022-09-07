package com.h.ti.controller;

import com.h.ti.dao.StudentRepository;
import com.h.ti.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/stu/crud")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping("/query")
    public Object queryStudents() {
        List<Student> all = studentRepository.findAll();
        return all;
    }

    @RequestMapping("/insert")
    public Object insertStudents() {
        Student student = new Student();
        student.setId(UUID.randomUUID().toString().replace("_",""));
        student.setName("张三");
        Student save = studentRepository.save(student);

        return save;
    }


}
