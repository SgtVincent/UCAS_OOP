import java.util.Vector;

public class Library {
    public Vector<Book> Books;

    public Library(Vector<Book> books){
        Books = new Vector<Book>();
        int size = books.size();
        for (int i = 0; i<size; i++){
            Books.addElement(books.get(i));
        }
    }
    public void Add_Book(Book book){
        Books.addElement(book);
    }

    public Book Get_Book(int index){
        int size = Books.size();
        for (int i=0; i<size; i++) {
            if (Books.get(i).index == index) {
                Book book = Books.get(i);
                Books.remove(i);
                return book;
            }
        }
        Book book = new Book(0, "");// book not find
        return book;
    }
    public Book Get_Book(String b_name){
        int size = Books.size();
        for (int i=0; i<size; i++) {
            if (Books.get(i).name.compareTo(b_name) == 0) {
                Book book = Books.get(i);
                Books.remove(i);
                return book;
            }
        }
        Book book = new Book(0, "");// book not find
        return book;
    }

}
