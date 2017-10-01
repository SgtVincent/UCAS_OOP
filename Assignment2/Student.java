import java.util.Vector;

public class Student extends Person{
    public Vector<Book> Borrowed_Books;
    public Student(String name_in, int ID_in){
        super(name_in, ID_in);
        Borrowed_Books = new Vector<Book>();
    }
    public void Ask_For_Book(Manager manager,int book_index ){
        Book book = manager.Find_Book(book_index);
        if(book.index != 0)
            Add_Book(book);

    }
    public void Ask_For_Book(Manager manager,String book_name ){
        Book book = manager.Find_Book(book_name);
        if(book.index != 0)
            Add_Book(book);
    }

    public void Return_Book(Manager manager, Book book){
        Book ret_book = book;
        manager.Get_Book(book);
        Borrowed_Books.remove(book);
    }

    public  void Add_Book(Book book){
        Borrowed_Books.addElement(book);
    }
}
