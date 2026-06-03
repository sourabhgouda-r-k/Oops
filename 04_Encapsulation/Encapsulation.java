
class Student {

    private int marks;

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
}

public class Encapsulation {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setMarks(90);
        System.out.println("Marks: " + s1.getMarks());
    }

}
