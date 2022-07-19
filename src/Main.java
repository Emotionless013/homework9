public class Main {
    public static void main(String[] args) {
        //минимальный уровень
        Author tolstoy = new Author("Lev", "Tolstoy");
        Book warPeace = new Book("War and peace", tolstoy, 1869);
        System.out.println("tolstoy.surname = " + tolstoy.getSurname());
        System.out.println("warPeace.author = " + warPeace.author.name + " " + warPeace.author.surname);
        Author dostoevsky = new Author("Fedor", "Dostoevsky");
        Book idiot = new Book("Idiot", dostoevsky, 1869);
        System.out.println("idiot.year = " + idiot.year);
        idiot.setYear(1868);
        System.out.println("idiot.year = " + idiot.year);

        //средний уровень
        //Необходимо в классе с методом main создать массив объектов типа Book и положить туда созданные книги.
        //Написать статические методы для работы с массивом в классе, где располагается метод main:
        //a. Добавить книгу (найти свободную ячейку массива и положить туда книгу). Учесть, что этот метод может быть
        // вызван любое количество раз (от 1 до 5) и каждая новая книга должна успешно укладываться в массив.
        //b.   Напечатать в консоль все книги из массива в следующем формате: “Stephen King: The Stand: 1978”

        //сложный уровень
        //1. Создать класс Library, который будет иметь своим полем массив из прошлого уровня.
        //Учесть, что доступ к нему должен быть только из Library (private поле), а сеттеры и геттеры отсутствуют.
        // Работать с массивом можно только через внутренние нестатические методы класса Library.
        //2. Конструктор класса должен получать в качестве параметра размер массива и инициализировать в себе поле
        // массива тем размером, что пришел параметром.
        //3. Перенести методы из прошлого уровня в класс Library, сделать их нестатическими.
        //4. Создать новые нестатические методы в классе Library:
        //Напечатать информацию о книге по ее названию, которое приходит в метод в качестве параметра.
        //   Формат: “The Stand by Stephen King was published in 1978”
        //Изменить год публикации книги по ее названию.
        //В метод подаются два параметра, а именно: название и новый год публикации.
        // Нужно найти книгу и изменить ее год публикации.
        Library library = new Library(5);
        library.addBook(new Book("Crime and punishment", dostoevsky, 1860));
        library.showLibrary();
        library.bookInfo("Crime and punishment");
        library.yearCorrection("Crime and punishment", 1866);
        library.yearCorrection("War and Peace", 1866);
    }
}