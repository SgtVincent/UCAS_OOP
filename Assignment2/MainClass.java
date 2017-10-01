import java.util.Vector;

public class MainClass {
    public static void main(String args[]){

        Book book1 = new Book(1, "Book1");
        Book book2 = new Book(2, "Book2");
        Book book3 = new Book(3, "Book3");
        Vector<Book> books = new Vector<Book>();
        books.addElement(book1);
        books.addElement(book2);
        books.addElement(book3);

        Library library = new Library(books);
        Manager manager = new Manager("Mark", 1111, library);
        Student student = new Student("Maria", 2222);
        student.Ask_For_Book(manager,"Book1");
        System.out.println("The student is reading the book...");
        student.Return_Book(manager, student.Borrowed_Books.get(0));

        return;

    }
}
