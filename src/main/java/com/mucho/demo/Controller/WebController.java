package com.mucho.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Mingfang Zhu
 * @Description:
 * @Date: Created in 14:12 2018/8/27
 */
@Controller
public class WebController {
    @RequestMapping("/")
    public String web(){

        return "index";
    }
}
