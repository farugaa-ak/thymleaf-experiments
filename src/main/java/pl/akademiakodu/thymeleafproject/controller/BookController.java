package pl.akademiakodu.thymeleafproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookController {

    //class mapping + method mapping "/book/showall"
    @GetMapping("/showall")
    public String showAllBooks(){
        return "book/show";
    }

    //bookadd

    // /book/add

    @GetMapping("/add")
    public String addBook(){
        return "book/show";
    }


    //POST
    //GET
    //PUT
    //DELETE
}
