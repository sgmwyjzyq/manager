package com.sgm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author SGM
 * @Date 2020/3/12 17:20
 * @Version V1.0
 */
@Controller
public class PageController {

    @RequestMapping("/{page}")
    public String showPage(String page){
        return  page;
    }
}
