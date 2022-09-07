package com.h.ti.dao;

import com.h.ti.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

@Mapper
public interface StudentRepository extends JpaRepository<Student,Integer> {


}
