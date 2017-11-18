package pl.akademiakodu.thymeleafproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class BookAsd {

    private static final BookAsd EMPTY_BOOK = new BookAsd("","","");

    @Id
    @GeneratedValue
    Long id;

    String author;
    String title;
    String price;

    public BookAsd() {
    }

    public BookAsd(String author, String title, String price) {
        this.author = author;
        this.title = title;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public static BookAsd emptyBook() {
        return EMPTY_BOOK;
    }

    @Override
    public String toString() {
        return "BookAsd{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookAsd book = (BookAsd) o;
        return Objects.equals(id, book.id) &&
                Objects.equals(author, book.author) &&
                Objects.equals(title, book.title) &&
                Objects.equals(price, book.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author, title, price);
    }
}
