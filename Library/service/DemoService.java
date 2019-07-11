package library.service;

import library.entity.Book;
import library.repository.Library;

public class DemoService implements Demorunable {

    @Override
    public void run() {
        Book book = new Book("Dead souls", "Gogol", 1);
        Book book2 = new Book("Anna Korenena", "Dostoevsky", 2);
        Book book3 = new Book("War and Peace", "Tolstoy", 3);

        Library library = new Library();

        System.out.println(library.addBook(book2));
        System.out.println(library.addBook(book));
        System.out.println(library.addBook(book3));

        System.out.println(library.findBook("dead souls", "gogol"));

        System.out.println(library.deleteBook(book3));

        System.out.println(library.findBook("War and peace", "tolstoy"));
    }
}
