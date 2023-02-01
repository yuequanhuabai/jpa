package com.h.ti.controller;

import com.h.ti.dao.StudentRepository;
import com.h.ti.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
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

    @PostMapping("/insert")
    public Object insertStudents(@RequestBody Map<String,Object> map) {
//        String name = stu.getName();
        String name =(String) map.get("name");
        Student student = new Student();
        student.setId(UUID.randomUUID().toString().replace("_", ""));
        student.setName(name);
        Student save = studentRepository.save(student);
        return save;
    }

    @PostMapping("/update")
    public Object updateStudents() {
        Student student = new Student();
        student.setId("CW0iuRJEPo");
        student.setName("张三");
        Student save = studentRepository.save(student);
        return save;
    }

    @PostMapping("/delete")
    public Object deleteStudents() {
        Student student = new Student();
        student.setId("ObNViAD2zm");
        studentRepository.delete(student);
        return "delete ok!";
    }


}
