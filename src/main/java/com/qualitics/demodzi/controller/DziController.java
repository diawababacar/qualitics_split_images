package com.qualitics.demodzi.controller;

import com.qualitics.demodzi.services.DziService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller("/image")
public class DziController {

    @Autowired
    private DziService dziService;

//    @GetMapping("/file")
//    public Map<String,String> getFileImage(@Req){
//        return dziService.createFileDzi();
//    }
}
