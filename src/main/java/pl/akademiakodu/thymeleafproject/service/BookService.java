package pl.akademiakodu.thymeleafproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.akademiakodu.thymeleafproject.model.Book;
import pl.akademiakodu.thymeleafproject.model.BookCRUDRepository;


//this is place for buisness logic
@Service
public class BookService {

    @Autowired
    BookCRUDRepository bookCRUDRepository;

    public Iterable<Book> findAll() {
        return bookCRUDRepository.findAll();
    }

    public Book save(Book book){
        return bookCRUDRepository.save(book);
    }
}
