package Ex7;

public class Book {
    private String author;
    private String name;
    private int year;

    public Book(String author, String name, int year) { // конструктор
        this.author = author;
        this.name = name;
        this.year = year;
    }
    // геттеры и сеттеры для поля author
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    // геттеры и сеттеры для поля name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    // геттеры и сеттеры для поля year
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
