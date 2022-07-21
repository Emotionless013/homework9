import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    //новые методы для домашки 10
    @Override
    public String toString() {
        return this.name + ' ' + this.surname;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Author)) return false;
        if (this == o) return true;
        Author author = (Author) o;
        if (this.name == author.name && this.surname == author.surname) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.surname.hashCode();
    }
}
