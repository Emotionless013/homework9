public class Library {
    private static Book[] library;

    public Library(int librarySize) {
        this.library = new Book[librarySize];
    }

    public void addBook(Book book) {
        for (int i = 0; i < library.length; i++) {
            if (library[i] == null) {
                library[i] = book;
                break;
            }
        }
    }

    public void showLibrary() {
        for (Book book : library) {
            if (book != null) {
                System.out.println(book.toString());
            }
        }
    }

    public void bookInfo(String bookName) {
        for (Book book : library) {
            if (book != null) {
                if (bookName.equalsIgnoreCase(book.getName())) {
                    System.out.println(book.toString());
                    break;
                }
            }
        }
    }

    public void yearCorrection(String bookName, int correctYear) {
        for (Book book : library) {
            if (book != null) {
                if (bookName.equalsIgnoreCase(book.getName())) {
                    book.setYear(correctYear);
                    System.out.println(book.toString());
                    break;
                }
            }
        }
    }

    //новый метод для домашки 10
    //Реализуйте метод toString в классе Library, который выводит все книги библиотеки в формате:
    //Library:
    //книга1
    //книга2
    //Использовать геттеры при написании этого метода запрещено. Нужно корректно делегировать формирование строки методу toString из книги.

    @Override
    public String toString() {
        StringBuilder  books = new StringBuilder();
        for (Book book : library) {
            if (book != null) {
                books = books.append(book.toString() + System.lineSeparator());
                System.out.print(books);
            }
        }
       return "Library:" + System.lineSeparator() + books;
    }
}
