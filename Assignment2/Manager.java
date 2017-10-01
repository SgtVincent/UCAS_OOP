public class Manager extends  Person{

    private Library library;

    public Manager(String name_in, int ID_in, Library library_in){
        super(name_in, ID_in);
        library = library_in;
    }

    public Manager(String mark, int i) {
        super(mark, i);
    }

    public Book Find_Book(String name){
        return library.Get_Book(name);
    }
    public Book Find_Book(int index) {
        return library.Get_Book(index);
    }

    public void Get_Book(Book book){
         library.Add_Book(book);
    }
}
