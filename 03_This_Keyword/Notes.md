# this Keyword in Java

## What is the `this` Keyword?

The `this` keyword is a reference variable that refers to the current object of a class.

Whenever an object calls a constructor or method, Java automatically knows which object is currently executing. The `this` keyword is used to refer to that object.

---

# Why Do We Need `this`?

The main purpose of `this` is to remove ambiguity between instance variables and local variables when they have the same name.

Without `this`, Java may get confused about which variable is being referred to.

---

# Syntax of `this`

```java
this.variableName;
```

Example:

```java
this.name;
this.age;
this.salary;
```

---

# Understanding the Need for `this`

## Problem Without `this`

```java
class Student {

    String name;

    Student(String name) {

        name = name;

    }

}
```

In the above code:

```java
name = name;
```

Both variables refer to the constructor parameter.

As a result, the instance variable remains unchanged.

---

## Solution Using `this`

```java
class Student {

    String name;

    Student(String name) {

        this.name = name;

    }

}
```

Here:

```java
this.name
```

refers to the instance variable.

```java
name
```

refers to the constructor parameter.

---

# Understanding `this.name = name`

## Example

```java
class Student {

    String name;

    Student(String name) {

        this.name = name;

    }

}
```

Object Creation:

```java
Student s1 = new Student("Sourabh");
```

Execution:

```java
this.name = name;
```

becomes:

```java
this.name = "Sourabh";
```

Result:

```text
Student Object
--------------
name = Sourabh
--------------
```

---

# Memory Understanding

## Before Constructor Execution

Heap Memory:

```text
Student Object
--------------
name = null
--------------
```

Stack Memory:

```text
name = Sourabh
```

(Constructor Parameter)

---

## During Execution

```java
this.name = name;
```

Java copies:

```text
Sourabh
```

from the constructor parameter into the object's instance variable.

---

## After Constructor Ends

Constructor parameter is destroyed.

Remaining Object:

```text
Student Object
--------------
name = Sourabh
--------------
```

The value remains stored inside the object.

---

# Easy Way to Read `this`

Whenever you see:

```java
this.name
```

Read it as:

```text
My name
```

Whenever you see:

```java
this.age
```

Read it as:

```text
My age
```

Whenever you see:

```java
this.salary
```

Read it as:

```text
My salary
```

---

# `this` Refers to Current Object

## Example

```java
class Student {

    String name;

    Student(String name) {

        this.name = name;

    }

}
```

```java
Student s1 = new Student("Sourabh");
Student s2 = new Student("Rahul");
```

For Object `s1`:

```java
this.name = "Sourabh";
```

For Object `s2`:

```java
this.name = "Rahul";
```

The meaning of `this` changes depending on which object is currently executing.

---

# Calling a Method Using `this`

The `this` keyword can also be used to call methods of the current object.

## Example

```java
class Student {

    void display() {

        System.out.println("Display Method");

    }

    void show() {

        this.display();

    }

}
```

Here:

```java
this.display();
```

means:

```text
Call display() method of the current object.
```

---

# Constructor Chaining Using `this()`

## What is Constructor Chaining?

Constructor chaining is the process of calling one constructor from another constructor of the same class.

It helps avoid code duplication.

---

# Syntax of Constructor Chaining

```java
this();
```

or

```java
this(parameter);
```

---

# Example of Constructor Chaining

```java
class Student {

    Student() {

        this("Sourabh");

        System.out.println("Default Constructor");

    }

    Student(String name) {

        System.out.println("Parameterized Constructor");

    }

}
```

Object Creation:

```java
Student s1 = new Student();
```

Output:

```text
Parameterized Constructor
Default Constructor
```

---

# Execution Flow of Constructor Chaining

```text
Student()
    |
    |
    V
Student("Sourabh")
    |
    |
    V
Return Back
    |
    |
    V
Student()
```

The called constructor executes first and then control returns to the original constructor.

---

# Constructor Chaining with Data Initialization

```java
class Student {

    String name;
    int age;

    Student() {

        this("Unknown", 18);

    }

    Student(String name, int age) {

        this.name = name;
        this.age = age;

    }

}
```

Object Creation:

```java
Student s1 = new Student();
```

Result:

```text
name = Unknown
age = 18
```

---

# Important Rule of `this()`

`this()` must always be the first statement inside a constructor.

Correct:

```java
Student() {

    this("Sourabh");

}
```

Wrong:

```java
Student() {

    System.out.println("Hello");

    this("Sourabh");

}
```

This will generate a compile-time error.

---

# Can We Use `this` in Static Methods?

No.

Example:

```java
class Student {

    static void show() {

        this.name = "Sourabh";

    }

}
```

Output:

```text
Compile Time Error
```

Reason:

Static methods belong to the class, not to an object.

Since no current object exists, `this` cannot be used.

---

# Common Uses of `this`

1. Access current object's instance variables.

```java
this.name
```

2. Call current object's methods.

```java
this.display();
```

3. Call another constructor of the same class.

```java
this();
this("Sourabh");
```

---

# Real-World Example

## Employee Information System

```java
class Employee {

    int id;
    String name;

    Employee(int id, String name) {

        this.id = id;
        this.name = name;

    }

    void display() {

        System.out.println(id + " " + name);

    }

}
```

```java
Employee e1 = new Employee(101, "Sourabh");
```

Execution:

```java
this.id = id;
this.name = name;
```

Result:

```text
101 Sourabh
```

---

# Common Mistakes

## Forgetting `this`

Wrong:

```java
class Student {

    String name;

    Student(String name) {

        name = name;

    }

}
```

Correct:

```java
class Student {

    String name;

    Student(String name) {

        this.name = name;

    }

}
```

---

## Using `this` in Static Method

Wrong:

```java
static void show() {

    this.name = "Java";

}
```

Reason:

`this` cannot be used inside static methods.

---

## Placing `this()` After Another Statement

Wrong:

```java
Student() {

    System.out.println("Hello");

    this("Sourabh");

}
```

Correct:

```java
Student() {

    this("Sourabh");

}
```

---

# Interview Questions

1. What is the `this` keyword in Java?
2. Why do we use `this.name = name`?
3. What does `this` refer to?
4. Can `this` be used inside static methods?
5. What is constructor chaining?
6. What is the purpose of `this()`?
7. What is the difference between `this` and `this()`?
8. Why must `this()` be the first statement in a constructor?
9. How does `this` help resolve variable name conflicts?
10. What are the common uses of the `this` keyword?

---

# Quick Revision

| Concept              | Description                                            |
| -------------------- | ------------------------------------------------------ |
| `this`               | Refers to the current object                           |
| `this.name`          | Access current object's instance variable              |
| `this.name = name`   | Assign parameter value to instance variable            |
| `this.display()`     | Call current object's method                           |
| `this()`             | Call another constructor of the same class             |
| Constructor Chaining | One constructor calling another constructor            |
| Static Method        | Cannot use `this`                                      |
| Main Purpose         | Resolve ambiguity between instance and local variables |
|                      |                                                        |
