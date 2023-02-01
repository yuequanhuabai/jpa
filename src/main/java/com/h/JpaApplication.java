package com.h;

import com.h.ti.conf.StartCommand;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.h.ti.dao.*")
@SpringBootApplication
public class JpaApplication {

    public static void main(String[] args) {
//           new StartCommand(args);
        SpringApplication.run(JpaApplication.class, args);
    }

}
