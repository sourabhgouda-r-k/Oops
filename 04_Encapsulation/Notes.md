# Encapsulation in Java

## What is Encapsulation?

Encapsulation is the process of binding data (variables) and methods together into a single unit (class) and restricting direct access to the data.

In simple words:

Encapsulation means hiding data and allowing access through controlled methods.

---

# Important Points About Encapsulation

- Encapsulation is one of the four pillars of OOP.
- It helps in Data Hiding.
- Variables are usually declared as `private`.
- Access to data is provided through methods.
- Getter methods are used to read data.
- Setter methods are used to modify data.
- Encapsulation improves security and maintainability.

---

# Why Encapsulation is Needed?

Without Encapsulation:

```java
class Student {

    public int age;

}
```

Anyone can write:

```java
Student s1 = new Student();

s1.age = -10;
```

Problem:

```text
Invalid data can be stored.
```

With Encapsulation:

```java
private int age;
```

Now direct access is restricted.

The object controls what data can be stored.

---

# How Encapsulation is Achieved?

Encapsulation is achieved in two steps:

### Step 1

Declare instance variables as private.

```java
private String name;
private int age;
```

### Step 2

Provide public getter and setter methods.

```java
getName()
setName()
```

---

# Syntax of Encapsulation

```java
class Student {

    private String name;

    public void setName(String name) {

        this.name = name;

    }

    public String getName() {

        return name;

    }

}
```

---

# Private Variables

Private variables cannot be accessed directly outside the class.

## Example

```java
class Student {

    private String name;

}
```

Wrong:

```java
Student s1 = new Student();

s1.name = "Sourabh";
```

Output:

```text
Compile Time Error
```

---

# Getter Method

A Getter method is used to read the value of a private variable.

## Example

```java
class Student {

    private String name;

    public String getName() {

        return name;

    }

}
```

Usage:

```java
System.out.println(s1.getName());
```

---

# Setter Method

A Setter method is used to modify the value of a private variable.

## Example

```java
class Student {

    private String name;

    public void setName(String name) {

        this.name = name;

    }

}
```

Usage:

```java
s1.setName("Sourabh");
```

---

# Complete Encapsulation Example

```java
class Student {

    private String name;

    public void setName(String name) {

        this.name = name;

    }

    public String getName() {

        return name;

    }

}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("Sourabh");

        System.out.println(s1.getName());

    }

}
```

Output:

```text
Sourabh
```

---

# Data Hiding

Data Hiding means preventing direct access to variables.

Example:

```java
private double salary;
```

Outside classes cannot access salary directly.

Only approved methods can access it.

---

# Validation Using Encapsulation

One of the biggest advantages of Encapsulation is validation.

## Example

```java
class Student {

    private int age;

    public void setAge(int age) {

        if(age > 0) {

            this.age = age;

        }

    }

}
```

Usage:

```java
s1.setAge(-10);
```

Result:

```text
Invalid value is rejected.
```

---

# Read-Only Class

A Read-Only property provides only Getter methods.

## Example

```java
class Student {

    private String college = "KLE";

    public String getCollege() {

        return college;

    }

}
```

Allowed:

```java
s1.getCollege();
```

Not Allowed:

```java
s1.setCollege();
```

---

# Write-Only Class

A Write-Only property provides only Setter methods.

## Example

```java
class Password {

    private String password;

    public void setPassword(String password) {

        this.password = password;

    }

}
```

Allowed:

```java
setPassword("1234");
```

Reading password is not possible.

---

# Fully Encapsulated Class

A class is fully encapsulated when all instance variables are private.

## Example

```java
class Student {

    private String name;
    private int age;

}
```

Both variables are hidden from direct access.

---

# Encapsulation vs Data Hiding

| Encapsulation                   | Data Hiding                      |
| ------------------------------- | -------------------------------- |
| Wraps data and methods together | Restricts direct access to data  |
| Achieved using classes          | Achieved using private variables |
| Broader concept                 | Part of Encapsulation            |

---

# Benefits of Encapsulation

### Security

Protects data from unauthorized access.

---

### Data Hiding

Prevents direct modification of variables.

---

### Validation

Allows checking data before storing.

---

### Better Maintenance

Internal code can be changed without affecting users.

---

### Flexibility

Provides controlled access to data.

---

# Real-World Example

## Bank Account System

```java
class BankAccount {

    private double balance;

    public void deposit(double amount) {

        if(amount > 0) {

            balance += amount;

        }

    }

    public double getBalance() {

        return balance;

    }

}
```

Main Method:

```java
public class Main {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        acc.deposit(5000);

        System.out.println(acc.getBalance());

    }

}
```

Output:

```text
5000
```

---

# JavaBean (POJO) Class

A class that contains:

- Private Variables
- Public Getters
- Public Setters

is called a JavaBean.

## Example

```java
class Student {

    private String name;

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

}
```

---

# Common Mistakes

## Using Public Variables

Wrong:

```java
public String name;
```

Correct:

```java
private String name;
```

---

## Forgetting Validation

Wrong:

```java
public void setAge(int age) {

    this.age = age;

}
```

Correct:

```java
public void setAge(int age) {

    if(age > 0) {

        this.age = age;

    }

}
```

---

## Accessing Private Variables Directly

Wrong:

```java
Student s1 = new Student();

s1.name = "Sourabh";
```

Correct:

```java
s1.setName("Sourabh");
```

---

# Interview Questions

1. What is Encapsulation?
2. Why is Encapsulation used?
3. How is Encapsulation achieved in Java?
4. What is Data Hiding?
5. What is the difference between Encapsulation and Data Hiding?
6. What is a Getter Method?
7. What is a Setter Method?
8. What is a Fully Encapsulated Class?
9. What is a Read-Only Class?
10. What are the advantages of Encapsulation?
11. What is a JavaBean?
12. How does Encapsulation improve security?

---

# Quick Revision

| Concept                  | Description                            |
| ------------------------ | -------------------------------------- |
| Encapsulation            | Binding data and methods into one unit |
| Data Hiding              | Restricting direct access to variables |
| Private Variable         | Hidden from outside classes            |
| Getter                   | Reads data                             |
| Setter                   | Modifies data                          |
| Validation               | Prevents invalid data                  |
| Read-Only                | Getter only                            |
| Write-Only               | Setter only                            |
| Fully Encapsulated Class | All variables are private              |
| Main Benefit             | Security and controlled access         |
|                          |                                        |
