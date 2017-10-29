package pl.akademiakodu.thymeleafproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.akademiakodu.thymeleafproject.model.Book;
import pl.akademiakodu.thymeleafproject.model.BookCRUDRepository;
import pl.akademiakodu.thymeleafproject.model.BookRepository;
import pl.akademiakodu.thymeleafproject.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    //class mapping + method mapping "/book/showall"
    @GetMapping("/showall")
    public String showAllBooks(ModelMap modelMap){
        modelMap.addAttribute("book", bookService.findAll());
        return "book/showall";
    }

    @GetMapping("/add")
    public String addBook(ModelMap modelMap){
        modelMap.addAttribute("book", new Book());
        modelMap.addAttribute("books", bookService.findAll());
        return "book/add";
    }

    @PostMapping("/add")
    public String createBook(@ModelAttribute Book book){
        bookService.save(book);

        return "redirect:/book/add";
    }


    //POST
    //GET
    //PUT
    //DELETE
}
