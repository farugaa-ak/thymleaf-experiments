package pl.akademiakodu.thymeleafproject.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import pl.akademiakodu.thymeleafproject.model.BookAsd;
import pl.akademiakodu.thymeleafproject.service.BookService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ApiBookController {

    @Autowired
    BookService bookService;

    @GetMapping(value = "/api/books" )
    @ResponseBody
    public List<BookAsd> getAllBooks() {
        List<BookAsd> books = new ArrayList<>();
        for (BookAsd iterBook : bookService.findAll()) {
            books.add(iterBook);
        }
        return books;
    }

    @GetMapping(value = "/api/books/{id}" )
    @ResponseBody //Jackson librar
    public BookAsd getAllBooks(@PathVariable Long id) {
        BookAsd book = bookService.fineOne(id);
        return book; //serializcja do JSONA
    }

    @PostMapping(value = "api/books")
    @ResponseBody           // deserializacja z JSONA
    @ResponseStatus(HttpStatus.CREATED)
    public void saveBook(@RequestBody BookAsd book) throws IllegalAccessException {
        bookService.save(book);
    }

    @DeleteMapping(value = "/api/books/{id}" )
    public void deleteBook(@PathVariable Long id) {
        bookService.delete(id);
    }
}
