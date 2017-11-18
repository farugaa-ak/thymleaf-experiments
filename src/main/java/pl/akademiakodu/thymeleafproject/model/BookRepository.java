package pl.akademiakodu.thymeleafproject.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookRepository {

    private List<BookAsd> books = new ArrayList<>();

    public List<BookAsd> getBooks() {
        return books;
    }



    public void addBook(BookAsd book) {
        books.add(book);
    }

    public BookAsd findOne(Long id) {
        for (BookAsd book : books) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        throw new IllegalArgumentException("not found book");
    }

    public List<BookAsd> findAll() {
        return books;
    }

    public BookAsd save(BookAsd book) {
        books.add(book);
        return book;
    }
}
