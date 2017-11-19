package pl.akademiakodu.thymeleafproject.service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import pl.akademiakodu.thymeleafproject.model.Book;
import pl.akademiakodu.thymeleafproject.model.BookRepository;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;

public class BookServiceTest {

    private BookService bookService;

    private BookRepository mockBookRepository = Mockito.mock(BookRepository.class);;

    @Before
    public void setup() {
        bookService = new BookService(mockBookRepository);
    }

    @Test //bdd
    public void shouldFindOneBookWhenIdIsKnown(){
        //given //argumenty , warunki dla testu
        Long id = 10l;

        Book bookAsd = new Book("szlachetnaPaczka", "t", "9");
        given(mockBookRepository.findOne(id)).willReturn(bookAsd);

        //when
        Book book = bookService.fineOne(id);

        //then
        assertThat(book.getAuthor(), is("szlachetnaPaczka"));
    }


}