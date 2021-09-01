package com.example.demo.comtroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author: qinzhangjia
 * @Date: 2021/8/31 10:05
 * @Description:
 */
@RestController
public class DemoController {

    @RequestMapping("/api/view")
    public Object index(){
        return "abc Tested by time："+new Date();
    }
}
