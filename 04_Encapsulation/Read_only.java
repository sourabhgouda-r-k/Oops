
class Student {

    private String name = "Sourabh";

    public String getName() {
        return name;
    }
}

public class Read_only {

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Name: " + s1.getName());
    }

}
