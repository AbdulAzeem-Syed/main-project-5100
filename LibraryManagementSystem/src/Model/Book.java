package Model;

/**
 *
 * @author Amer
 */
public class Book {
    private int bookId;
    private String name;
    private String author;
    private boolean isAvailableOffline;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailableOffline() {
        return isAvailableOffline;
    }

    public void setIsAvailableOffline(boolean isAvailableOffline) {
        this.isAvailableOffline = isAvailableOffline;
    }
}
