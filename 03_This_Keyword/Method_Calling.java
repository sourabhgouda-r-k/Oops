
class Student {

    String name;
    int age;
    int marks_1;
    int marks_2;

    Student(String name, int age, int marks_1, int marks_2) {
        this.name = name;
        this.age = age;
        this.marks_1 = marks_1;
        this.marks_2 = marks_2;
    }

    int total_marks() {
        return marks_1 + marks_2;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Total Marks without using this keyword: " + total_marks()); // calling the method of current object. 
        System.out.println("Total Marks with using this keyword: " + this.total_marks()); // this keyword is optional. 
    }

}

public class Method_Calling {

    public static void main(String[] args) {
        Student s1 = new Student("Sourabh", 21, 90, 78);
        s1.display();

    }

}
