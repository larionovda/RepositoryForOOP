package Library;

public class LibraryServiceImpl implements LibraryService {

    Library library = new Library();

    @Override
    public void addBook(Book book) {
        if (library.getBooks().length >= book.getId()) {
            library.getBooks()[book.getId() - 1] = book;
            System.out.println(book.toString() + " was add in library");
        } else {
            System.out.println("Library is full");
        }
    }

    @Override
    public void deleteBook(Book book) {
        for (int i = 0; i < library.getBooks().length; i++) {
            if (library.getBooks()[i] != null) {
                if (book.getAutorBook().equalsIgnoreCase(library.getBooks()[i].getAutorBook()) &&
                        book.getNameBook().equalsIgnoreCase(library.getBooks()[i].getNameBook())) {
                    library.getBooks()[i] = null;
                    System.out.println(book.toString() + " was deleted from library");
                    break;
                }
            }
        }
    }

    @Override
    public void findBook(Book book) {
        for (int i = 0; i < library.getBooks().length; i++) {
            if (library.getBooks()[i] != null) {
                if (book.getAutorBook().equalsIgnoreCase(library.getBooks()[i].getAutorBook()) &&
                        book.getNameBook().equalsIgnoreCase(library.getBooks()[i].getNameBook())) {
                    System.out.println(book.toString() + " exists in the library");
                    break;
                }
            }
        }
    }
}
