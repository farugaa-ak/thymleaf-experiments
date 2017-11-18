package pl.akademiakodu.thymeleafproject.service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import pl.akademiakodu.thymeleafproject.model.BookAsd;
import pl.akademiakodu.thymeleafproject.model.BookCRUDRepository;
import pl.akademiakodu.thymeleafproject.model.BookRepository;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;

public class BookServiceTest {

    private BookService bookService;

    private BookCRUDRepository mockBookCRUDRepository = Mockito.mock(BookCRUDRepository.class);
    private BookRepository mockBookRepository = Mockito.mock(BookRepository.class);;

    @Before
    public void setup() {
        bookService = new BookService(mockBookCRUDRepository, mockBookRepository);
    }

    @Test //bdd
    public void shouldFindOneBookWhenIdIsKnown(){
        //given //argumenty , warunki dla testu
        Long id = 10l;

        BookAsd bookAsd = new BookAsd("szlachetnaPaczka", "t", "9");
        given(mockBookCRUDRepository.findOne(id)).willReturn(bookAsd);

        //when
        BookAsd book = bookService.fineOne(id);

        //then
        assertThat(book.getAuthor(), is("szlachetnaPaczka"));
    }

    @Test
    public void shouldFindEmptyBookWhenExceptionOccur(){
        //given //argumenty , warunki dla testu
        Long id = 10l;

        given(mockBookCRUDRepository.findOne(id)).willThrow(new RuntimeException("error"));

        //when
        BookAsd book = bookService.fineOne(id);

        //then
        assertThat(book.getAuthor(), is(""));
        assertThat(book.getTitle(), is(""));
        assertThat(book.getPrice(), is(""));
    }



}