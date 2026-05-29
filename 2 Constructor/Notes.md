# Constructors in Java

## What is a Constructor?

A constructor is a special method used to initialize objects.

It is automatically called when an object is created.

---

# Important Points About Constructors

- Constructor name should be same as class name
- Constructors do not have return type
- Constructors are called automatically
- Used to initialize object data

---

# Syntax of Constructor

```java id="d71gj8"
class ClassName {

    ClassName() {

        // code

    }

}
```

---

# Example of Constructor

```java id="tz9j3v"
class Student {

    Student() {

        System.out.println("Constructor Called");

    }

}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

    }

}
```

---

# Why Constructors are Used?

Constructors are used to:

- initialize object values
- reduce repeated code
- make object creation easier

---

# Types of Constructors

1. Default Constructor
2. Parameterized Constructor

---

# Default Constructor

A constructor without parameters is called default constructor.

## Example

```java id="4n9cb6"
class Car {

    Car() {

        System.out.println("Car Object Created");

    }

}

public class Main {

    public static void main(String[] args) {

        Car c1 = new Car();

    }

}
```

---

# Parameterized Constructor

A constructor with parameters is called parameterized constructor.

## Example

```java id="ypr2w1"
class Student {

    int id;
    String name;

    Student(int i, String n) {

        id = i;
        name = n;

    }

    void display() {

        System.out.println(id + " " + name);

    }

}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Rahul");

        s1.display();

    }

}
```

---

# Constructor Overloading

Having multiple constructors with different parameters is called constructor overloading.

## Example

```java id="0zup6x"
class Employee {

    Employee() {

        System.out.println("Default Constructor");

    }

    Employee(String name) {

        System.out.println(name);

    }

}

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee();

        Employee e2 = new Employee("Sourabh");

    }

}
```

---

# this Keyword in Constructor

`this` refers to current object.

Used when local variables and instance variables have same name.

## Example

```java id="rsc1ph"
class Student {

    int id;

    Student(int id) {

        this.id = id;

    }

    void display() {

        System.out.println(id);

    }

}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student(101);

        s1.display();

    }

}
```

---

# Constructor vs Method

| Constructor          | Method          |
| -------------------- | --------------- |
| Initializes object   | Performs task   |
| Same name as class   | Any valid name  |
| No return type       | Has return type |
| Called automatically | Called manually |

---

# Real-World Example

## Mobile Phone Details

```java id="n6nq8x"
class Mobile {

    String brand;
    int price;

    Mobile(String b, int p) {

        brand = b;
        price = p;

    }

    void display() {

        System.out.println(brand);
        System.out.println(price);

    }

}

public class Main {

    public static void main(String[] args) {

        Mobile m1 = new Mobile("Samsung", 25000);

        m1.display();

    }

}
```

---

# Common Mistakes

## Giving Return Type to Constructor

Wrong:

```java id="57fby0"
void Student() {

}
```

Correct:

```java id="0vcn3s"
Student() {

}
```

---

## Constructor Name Different from Class Name

Wrong:

```java id="om1x44"
class Student {

    StudentData() {

    }

}
```

Correct:

```java id="s8e6l1"
class Student {

    Student() {

    }

}
```

---

# Interview Questions

1. What is constructor?
2. Why are constructors used?
3. Difference between constructor and method?
4. What is constructor overloading?
5. What is parameterized constructor?
6. Can constructor have return type?
7. When is constructor called?
