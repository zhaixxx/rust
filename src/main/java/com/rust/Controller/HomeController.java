package com.rust.Controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import com.rust.Item.Testitem;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HomeController {
    @GetMapping("/test")
    public String testOne(){
        ArrayList<Testitem> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(new Testitem(i,"just do it!"));
        }
        return JSONObject.toJSONString(list);
    }
}
