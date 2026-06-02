# Java OOP Foundations

## Introduction

Before learning Object-Oriented Programming (OOP), it is important to understand how Java stores data, manages memory, and handles variables. Concepts such as classes, objects, constructors, and the `this` keyword become much easier once these fundamentals are clear.

---

# 1. Scope of Variables

The scope of a variable determines where it can be accessed and how long it exists in memory.

Java mainly provides three types of variables:

1. Local Variables
2. Instance Variables
3. Static Variables

---

## 1.1 Local Variables

A local variable is declared inside a method, constructor, or block.

### Example

```java
class Student {

    void display() {
        int age = 21;
        System.out.println(age);
    }
}
```

In the above example:

```java
int age = 21;
```

is a local variable.

### Characteristics

- Declared inside a method or constructor.
- Accessible only within that method.
- Created when the method starts execution.
- Destroyed when the method completes execution.
- Stored in Stack Memory.

### Example

```java
class Test {

    void show() {
        int x = 10;
        System.out.println(x);
    }
}
```

The variable `x` cannot be accessed outside the `show()` method.

### Important Points

- Local variables must be initialized before use.
- They are temporary in nature.
- They are not associated with objects.

### Interview Question

**Q:** Where are local variables stored?

**Answer:** Local variables are stored in Stack Memory.

---

## 1.2 Instance Variables

An instance variable is declared inside a class but outside all methods and constructors.

### Example

```java
class Student {

    String name;
    int age;
}
```

Here:

```java
String name;
int age;
```

are instance variables.

### Characteristics

- Belong to an object.
- Each object gets its own copy.
- Stored inside objects in Heap Memory.
- Accessible throughout the class.

### Example

```java
Student s1 = new Student();
Student s2 = new Student();
```

Memory Representation:

```text
s1 Object
-------------
name
age
-------------

s2 Object
-------------
name
age
-------------
```

Both objects maintain separate values.

### Real-World Example

Consider a Student Management System.

Every student has:

- Name
- Age
- Roll Number

Since each student has different values, these should be instance variables.

### Important Points

- Instance variables receive default values if not initialized.
- They are created when an object is created.
- They are destroyed when the object is removed from memory.

### Interview Question

**Q:** Why does every object get its own copy of instance variables?

**Answer:** Because instance variables belong to individual objects and represent the state of that specific object.

---

## 1.3 Static Variables

A static variable is declared using the `static` keyword.

### Example

```java
class Student {

    static String college = "KLE";
}
```

### Characteristics

- Shared among all objects.
- Only one copy exists.
- Belongs to the class rather than any object.

### Example

```java
Student s1 = new Student();
Student s2 = new Student();
```

Both objects use the same value:

```text
college = KLE
```

### Real-World Example

Suppose all students belong to the same college.

```java
static String college = "KLE";
```

There is no need to store the college name separately for every student.

### Important Points

- Memory efficient because only one copy exists.
- Can be accessed using the class name.

```java
Student.college
```

### Interview Question

**Q:** Why should a common property be declared as static?

**Answer:** To avoid creating duplicate copies for every object and save memory.

---

# 2. Methods

A method is a block of code that performs a specific task.

### Example

```java
class Calculator {

    void add() {
        System.out.println(10 + 20);
    }
}
```

### Characteristics

- Improves code reusability.
- Reduces code duplication.
- Makes programs modular and easier to maintain.

### Real-World Example

A smartphone performs different actions:

```text
call()
message()
camera()
calculator()
```

Each action can be represented by a method.

---

# 3. Memory Management in Java

Java mainly uses two memory areas:

1. Stack Memory
2. Heap Memory

Understanding these is crucial for understanding objects and references.

---

## 3.1 Stack Memory

Stack Memory stores:

- Local Variables
- Method Calls
- Reference Variables

### Example

```java
public static void main(String[] args) {

    int age = 21;
}
```

The variable `age` is stored in Stack Memory.

### Characteristics

- Fast memory access.
- Automatically managed by Java.
- Temporary storage.

### Important Points

- Variables disappear when the method ends.
- Every method call creates a new stack frame.

### Interview Question

**Q:** What is stored in Stack Memory?

**Answer:** Local variables, method calls, and references.

---

## 3.2 Heap Memory

Heap Memory stores:

- Objects
- Instance Variables

### Example

```java
Student s1 = new Student();
```

The actual object is created in Heap Memory.

### Characteristics

- Larger than Stack Memory.
- Stores dynamically created objects.
- Managed by the Garbage Collector.

### Important Points

- Objects remain in memory until no references point to them.
- Heap Memory is shared among all threads.

### Interview Question

**Q:** What is stored in Heap Memory?

**Answer:** Objects and their instance variables.

---

# 4. Reference Variables

A reference variable stores the address of an object.

### Example

```java
Student s1 = new Student();
```

Here:

```java
s1
```

is a reference variable.

### Memory Representation

```text
Stack Memory
-------------
s1
-------------
 |
 |
 V

Heap Memory
----------------
Student Object
----------------
```

### Important Points

- A reference variable is not the object itself.
- It only stores the address of the object.
- Multiple references can point to the same object.

### Real-World Example

Consider a house.

```text
House = Object

House Address = Reference Variable
```

The address helps locate the house but is not the house itself.

### Interview Question

**Q:** What is the difference between an object and a reference variable?

**Answer:** The object contains data, while the reference variable stores the address of that object.

---

# 5. Objects

An object is an instance of a class.

### Example

```java
class Student {

    String name;
    int age;
}
```

Creating an object:

```java
Student s1 = new Student();
```

### Real-World Example

```text
Blueprint = Class

Actual House = Object
```

The blueprint defines the structure, while the house is the actual implementation.

### Important Points

- Objects occupy Heap Memory.
- Objects store data and behavior.
- Multiple objects can be created from a single class.

---

# 6. The `this` Keyword

The `this` keyword refers to the current object.

### Example

```java
class Student {

    String name;

    Student(String name) {
        this.name = name;
    }
}
```

### Why Do We Need `this`?

Consider:

```java
class Student {

    String name;

    Student(String name) {
        name = name;
    }
}
```

Java cannot distinguish between the instance variable and the constructor parameter.

Using:

```java
this.name = name;
```

clarifies that:

```text
this.name → Instance Variable

name → Constructor Parameter
```

### Practical Example

```java
Student s1 = new Student("Sourabh");
```

Execution:

```java
this.name = "Sourabh";
```

Result:

```text
Student Object
----------------
name = Sourabh
----------------
```

### Common Uses of `this`

#### Access Current Object Variables

```java
this.name
```

#### Call Current Class Methods

```java
this.display();
```

#### Call Another Constructor

```java
this();
```

### Important Points

- `this` always refers to the current object.
- Cannot be used inside static methods.
- Frequently used inside constructors and setters.

### Interview Question

**Q:** What does the `this` keyword represent?

**Answer:** It represents the current object of the class.

---

# Summary

| Concept            | Description                           |
| ------------------ | ------------------------------------- |
| Local Variable     | Exists inside a method                |
| Instance Variable  | Belongs to an object                  |
| Static Variable    | Shared among all objects              |
| Method             | Performs a task                       |
| Stack Memory       | Stores local variables and references |
| Heap Memory        | Stores objects                        |
| Reference Variable | Stores object address                 |
| Object             | Instance of a class                   |
| this Keyword       | Refers to the current object          |
