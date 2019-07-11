package library.repository;

import library.entity.Book;
import library.service.LibraryService;

public class Library implements LibraryService {

    private Book[] books = new Book[10];

    public Book[] getBooks() {
        return books;
    }

    private boolean isBoolIfHaveNameBook(int i, Book book) {
        return getBooks()[i] != null && book.getAutorBook().equalsIgnoreCase(getBooks()[i].getAutorBook()) &&
                book.getNameBook().equalsIgnoreCase(getBooks()[i].getNameBook());
    }

    private boolean isBoolIfHaveNameBook(int i, String nameBook, String autorBook) {
        return getBooks()[i] != null && nameBook.equalsIgnoreCase(getBooks()[i].getNameBook()) &&
                autorBook.equalsIgnoreCase(getBooks()[i].getAutorBook());
    }


    @Override
    public boolean addBook(Book book) {
        if (getBooks().length >= book.getId()) {
            getBooks()[book.getId() - 1] = book;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteBook(Book book) {
        for (int i = 0; i < getBooks().length; i++) {
            if (isBoolIfHaveNameBook(i, book)) {
                getBooks()[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Book findBook(String nameBook, String autorBook) {
        for (int i = 0; i < getBooks().length; i++) {
            if (isBoolIfHaveNameBook(i, nameBook, autorBook)) {
                return getBooks()[i];
            }
        }
        return null;
    }
}
