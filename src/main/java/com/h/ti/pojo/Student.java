package com.h.ti.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity(name = "student")
public class Student {
    @Id
    @GeneratedValue
    private  String id ;
    private  String name;




}
