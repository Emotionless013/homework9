public class Library {
    public static Book[] library;

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
                System.out.println(book.getAuthor().getName() + " " + book.getAuthor().getSurname() + ": " + book.getName() + ": " + book.getYear());
            }
        }
    }

    public void bookInfo(String bookName) {
        for (Book book : library) {
            if (book != null) {
                if (bookName.equalsIgnoreCase(book.getName())) {
                    System.out.println(book.getName() + " by " + book.getAuthor().getName() + " " + book.getAuthor().getSurname() + " was published in " + book.getYear());
                } else {
                    System.out.println("Такой книги в билиотеке нет!");
                }
            }
        }
    }

    public void yearCorrection(String bookName, int correctYear) {
        for (Book book : library) {
            if (book != null) {
                if (bookName.equalsIgnoreCase(book.getName())) {
                    book.setYear(correctYear);
                    System.out.println(book.getName() + " by " + book.getAuthor().getName() + " " + book.getAuthor().getSurname() + " was published in " + book.getYear());
                } else {
                    System.out.println("Такой книги в билиотеке нет!");
                }
            }
        }
    }

}
