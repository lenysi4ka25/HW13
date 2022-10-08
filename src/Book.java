public class Book {
    private final String title;
    private final Author author;
    private int editionsYear;

    public Book(String title, Author author, int editionsYear) {
        this.title = title;
        this.author = author;
        this.editionsYear = editionsYear;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getEditionsYear() {
        return this.editionsYear;
    }

    public void setEditionsYear(int editionsYear) {
        this.editionsYear = editionsYear;
    }
}

