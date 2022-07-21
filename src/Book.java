public class Book {
    private String name;
    private Author author;
    private int year;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //новые методы для домашки 10

    @Override
    public String toString() {
        return this.name + " by "  + this.author.toString() + " was written at " + this.year;
    }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book)) return false;
        if (this == o) return true;
        Book book = (Book) o;
        if (this.name == book.name && this.author.equals(book.getAuthor()) && this.year == book.year) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.author.hashCode() + this.year;
    }
}
