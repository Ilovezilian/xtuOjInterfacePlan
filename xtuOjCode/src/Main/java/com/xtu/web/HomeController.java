package com.xtu.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * Created by Ilovezilian on 2017/4/12.
 */
@Controller
@RequestMapping({"/","/index"})
public class HomeController {
//    @RequestMapping(value = "/", method = GET)
    @RequestMapping(method = GET)
    public String index() {
        return "index";
    }
}
