public class Person {
    private String Name;
    private int ID;
    public Person(String name_in, int ID_in){
        Name = name_in;
        ID = ID_in;
    }
    public String Tell_Name(){
        return Name;
    }
    public int Show_ID(){
        return ID;
    }
}
