class Student{
    int id;
    String name;
    Student(){
        id = 101;
        name = "Sourabh";
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    }

}
public class Constructor{
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}