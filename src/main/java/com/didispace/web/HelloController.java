package com.didispace.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：Yorick
 * @date ：Created in 2020/4/21 上午 09:53
 * @description：springbootTest
 * @modified By：
 * @version: $
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}
