package library.service;

import library.entity.Book;

public interface LibraryService {

    boolean addBook(Book book);

    boolean deleteBook(Book book);

    Book findBook(String a, String b);

}
