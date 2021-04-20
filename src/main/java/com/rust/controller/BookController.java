package com.rust.controller;

import com.rust.pojo.Books;
import com.rust.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class BookController {
    //controller 调 service层
    @Autowired
    private BookService bookService;

    //查询全部的书籍，并且返回到一个书籍展示
    @GetMapping("/allBook")
    public String list(Model model){
        List<Books> list=bookService.queryAllBook();
        model.addAttribute("list",list);
         return "";
    }
}
