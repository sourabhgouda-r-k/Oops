public class Class_objects{
    int id;
    String name;

    void display(){
        System.out.println(id);
        System.out.println(name);
    }
    public static void main(String[] args) {
        Class_objects C1 = new Class_objects();
        C1.id = 101;
        C1.name = "Sourabh";
        C1.display();
    }
}