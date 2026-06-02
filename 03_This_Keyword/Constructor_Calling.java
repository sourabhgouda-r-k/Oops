
class Student {

    String name;
    int age;

    Student() {
        this("Sourabh", 21);
        System.out.println("This is First constructor!");

    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("This is second Constructor! ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }

}

public class Constructor_Calling {

    public static void main(String[] args) {
        Student s1 = new Student();

    }

}
