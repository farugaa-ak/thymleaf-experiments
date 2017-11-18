package pl.akademiakodu.thymeleafproject.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.akademiakodu.thymeleafproject.model.BookAsd;
import pl.akademiakodu.thymeleafproject.model.BookCRUDRepository;
import pl.akademiakodu.thymeleafproject.model.BookRepository;

import java.util.Collections;


//this is place for buisness logic
@Service
public class BookService {

    private static final Logger log = LoggerFactory.getLogger(BookService.class);

     //FIELD/SETTER injection
    private BookCRUDRepository bookCRUDRepository;
    private BookRepository bookRepository;

    //CONSTRUCTOR injection
    @Autowired
    public BookService(BookCRUDRepository bookCRUDRepository, BookRepository bookRepository) {
        this.bookCRUDRepository = bookCRUDRepository;
        this.bookRepository = bookRepository;
    }




    public BookAsd fineOne(Long id) {
        try {
            return bookCRUDRepository.findOne(id);
        } catch (Exception e){
            log.error("Exception during finding book with id={}", id, e);
            return BookAsd.emptyBook();
        }
    }

    public Iterable<BookAsd> findAll() {
        log.info("User is trying to get all books");
        try {
            return bookCRUDRepository.findAll();
        } catch (Exception e) {
            log.error("Exception occured during call to database", e);
            return Collections.emptyList();
        }
    }

    public BookAsd save(BookAsd book) throws IllegalAccessException {
        log.info("User is trying to get all books");

        if (book.getAuthor().equalsIgnoreCase("artur")) {
            log.error("artur is not allowed to save book={}", book);
            throw new IllegalAccessException("artur is not allowed to save book");
        }
        return bookCRUDRepository.save(book);
    }

    public void delete(Long id) {
        bookCRUDRepository.delete(id);
    }
}
