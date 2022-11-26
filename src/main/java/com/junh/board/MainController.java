package com.junh.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @RequestMapping("/sbb")
    @ResponseBody
    public String index() {
        return "안녕하세요 이지유 집에 오신것을 환영합니다.";
    }    

    @RequestMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}
