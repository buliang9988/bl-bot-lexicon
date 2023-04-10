package com.bl.bot.controller;

import com.bl.bot.service.main.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ChatController
 * @Description TODO
 * @Author ljf
 * @Date 2023/3/28 13:40
 * @Version 2.0
 **/
@RestController
@RequestMapping(("/bot"))
public class ChatController {
    @Autowired
    private MainService mainService;

    @GetMapping("/chat")
    public String chat() {
        return "成功";
    }
}
