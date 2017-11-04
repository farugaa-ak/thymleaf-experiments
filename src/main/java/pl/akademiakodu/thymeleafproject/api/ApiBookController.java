package pl.akademiakodu.thymeleafproject.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.akademiakodu.thymeleafproject.model.Book;
import pl.akademiakodu.thymeleafproject.service.BookService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ApiBookController {

    @Autowired
    BookService bookService;

    @GetMapping(value = "/api/books" )
    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        for (Book iterBook : bookService.findAll()) {
            books.add(iterBook);
        }
        return books;
    }
}
