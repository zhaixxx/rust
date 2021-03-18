package com.rust.Controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import com.rust.Item.Testitem;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/test")
    public String testOne(){
        return JSONObject.toJSONString(new Testitem(1,"hello world!"));
    }
}
