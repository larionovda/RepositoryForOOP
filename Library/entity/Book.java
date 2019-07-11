package library.entity;

public class Book {

    private String nameBook;
    private String authorBook;
    private int id;

    public Book(String nameBook, String authorBook, int id) {
        this.nameBook = nameBook;
        this.authorBook = authorBook;
        this.id = id;
    }

    public String getNameBook() {
        return nameBook;
    }

    public int getId() {
        return id;
    }

    public String getAutorBook() {
        return authorBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", authorBook='" + authorBook + '\'' +
                ", id=" + id +
                '}';
    }
}
