package Library;

public class DemoService implements Demorunable {

    @Override
    public void run() {
        Book book = new Book("Dead souls", "Gogol", 1);
        Book book2 = new Book("Anna Korenena", "Dostoevsky", 2);
        Book book3 = new Book("War and Peace", "Tolstoy", 3);

        LibraryServiceImpl libraryService = new LibraryServiceImpl();

        libraryService.addBook(book2);
        libraryService.addBook(book);
        libraryService.addBook(book3);

        libraryService.findBook(book2);

        libraryService.deleteBook(book3);

        libraryService.findBook(book3);
    }
}
