package com.h.ti.te;


import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Htest {

@Test
public void test1() throws ClassNotFoundException, SQLException {

    Class.forName("com.mysql.cj.jdbc.Driver");

    Connection conn=null;
    System.out.println("hello world!");

    String url="jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&characterSetResults=utf8&useSSL=false";
    String user="root";
    String password="root";

     conn = DriverManager.getConnection(url, user, password);

    System.out.println(conn);


}
}
