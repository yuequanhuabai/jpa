package com.h.ti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DynamicDataSourceController {

    @RequestMapping("/switch")
    public String switchDataSource() {


        return "";

    }

}
