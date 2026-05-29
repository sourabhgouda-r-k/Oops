# Classes and Objects in Java

## What is a Class?

A class is a blueprint used to create objects.

It contains:

- Variables
- Methods

A class defines the properties and behaviors of an object.

---

# Real-Life Example

Consider a `Car`.

A car has:

- color
- brand
- speed

These are called:

- Properties (Variables)

A car can:

- start
- stop
- accelerate

These are called:

- Behaviors (Methods)

---

# Syntax of Class

```java id="m2pj5r"
class ClassName {

    // variables

    // methods

}
```

---

# Example of Class

```java id="n6twzp"
class Student {

    int id;
    String name;

}
```

---

# What is an Object?

An object is an instance of a class.

Objects are used to access variables and methods of a class.

---

# Creating Object

## Syntax

```java id="8xy8tw"
ClassName objectName = new ClassName();
```

---

# Example

```java id="thxkt0"
Student s1 = new Student();
```

Here:

- `Student` → class name
- `s1` → object name
- `new` → keyword used to create object

---

# Complete Example of Class and Object

```java id="v2k7hl"
class Student {

    int id;
    String name;

}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.id = 101;
        s1.name = "Rahul";

        System.out.println(s1.id);
        System.out.println(s1.name);

    }

}
```

---

# Accessing Class Members

Use dot `.` operator.

## Example

```java id="yd1j4m"
s1.name = "Sourabh";

System.out.println(s1.name);
```

---

# Multiple Objects

A class can have multiple objects.

## Example

```java id="g1ny5r"
class Student {

    int id;
    String name;

}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Rahul";
        s2.name = "Ankit";

        System.out.println(s1.name);
        System.out.println(s2.name);

    }

}
```

---

# Methods in Class

Methods define behavior of objects.

## Example

```java id="0r2tvv"
class Car {

    void start() {

        System.out.println("Car Started");

    }

}

public class Main {

    public static void main(String[] args) {

        Car c1 = new Car();

        c1.start();

    }

}
```

---

# Instance Variables

Variables declared inside class but outside methods are called instance variables.

## Example

```java id="m4v9yu"
class Employee {

    int id;
    String name;

}
```

---

# Local Variables

Variables declared inside methods are called local variables.

## Example

```java id="w98j8f"
void display() {

    int age = 20;

}
```

---

# this Keyword

`this` refers to the current object.

Used to differentiate instance variables and local variables.

## Example

```java id="2i9xwq"
class Student {

    int id;

    void setId(int id) {

        this.id = id;

    }

}
```

---

# Anonymous Object

An object without reference variable is called anonymous object.

## Example

```java id="k2xpr8"
new Student();
```

---

# Real-World Example

## Mobile Phone Example

```java id="m4sqf4"
class Mobile {

    String brand;
    int price;

    void display() {

        System.out.println(brand);
        System.out.println(price);

    }

}

public class Main {

    public static void main(String[] args) {

        Mobile m1 = new Mobile();

        m1.brand = "Samsung";
        m1.price = 25000;

        m1.display();

    }

}
```

---

# Difference Between Class and Object

| Class               | Object            |
| ------------------- | ----------------- |
| Blueprint           | Instance of class |
| Logical entity      | Physical entity   |
| No memory allocated | Memory allocated  |
| Defines properties  | Uses properties   |

---

# Common Mistakes

## Forgetting to Create Object

Wrong:

```java id="7j20lu"
Student.name = "Rahul";
```

Correct:

```java id="9wo4xw"
Student s1 = new Student();

s1.name = "Rahul";
```

---

## Accessing Variables Incorrectly

Wrong:

```java id="0yq1j4"
System.out.println(name);
```

Correct:

```java id="n6h7lb"
System.out.println(s1.name);
```

---

# Interview Questions

1. What is a class?
2. What is an object?
3. Difference between class and object?
4. What are instance variables?
5. What is this keyword?
6. What are local variables?
7. What is anonymous object?
8. Why are objects important?
