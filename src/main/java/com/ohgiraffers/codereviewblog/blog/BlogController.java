package com.ohgiraffers.codereviewblog.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @GetMapping("/main")
    public String main() {
        return "main";
    }

    @GetMapping("/blog")
    public String blog() {
        return "blog/review";
    }
}
