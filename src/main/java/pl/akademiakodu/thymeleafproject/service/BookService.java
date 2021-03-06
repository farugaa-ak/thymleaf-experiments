package pl.akademiakodu.thymeleafproject.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.akademiakodu.thymeleafproject.model.Book;
import pl.akademiakodu.thymeleafproject.model.BookRepository;

import java.util.Collections;


//this is place for buisness logic
@Service
public class BookService {

    private static final Logger log = LoggerFactory.getLogger(BookService.class);

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book fineOne(Long id) {
        try {
            return bookRepository.findOne(id);
        } catch (Exception e) {
            log.error("Exception during finding book with id={}", id, e);
            return Book.emptyBook();
        }
    }

    public Iterable<Book> findAll() {
        log.info("User is trying to get all books");
        try {
            return bookRepository.findAll();
        } catch (Exception e) {
            log.error("Exception occured during call to database", e);
            return Collections.emptyList();
        }
    }

    public Book save(Book book) throws IllegalAccessException {
        log.info("User is trying to get all books");

        if (book.getAuthor().equalsIgnoreCase("artur")) {
            log.error("artur is not allowed to save book={}", book);
            throw new IllegalAccessException("artur is not allowed to save book");
        }
        return bookRepository.save(book);
    }

    public void delete(Long id) {
        //bookRepository.delete(id);
    }
}
