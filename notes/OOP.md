## Definition

Object oriented programming (OOP) is a programming paradigm that organizes code into objects, which encapsulates data and behaviour. This approach enhances code modularity, reusability, and maintainability. The fundamental concepts of OOP includes, creating objects and classes, defining methods, attribute, and constructors.

It represents an attempt to make programs more closely model the way people think about and deal with the world. In OOP, subroutines are often referred to as methods. Objects are closely related to classes as they also contain variables and methods.

The three main pillars of OOP inludes but not limited to:

- Encapsulation
- Inheritance
- Polymorphism

## Encapsulation

Encapsulation is a programming concept in object-oriented programming that refers to bundling or binding of data and methods within a single uint (within a class); It can also be said to be a projective shield that prevents the data from being accessed outisde it's shield.

In Java, encapsulation can be achieved by declaring the instance variables of a class as private, which means they can only be accessed within the class.

## Importance of Encapsulation

- Better control of class attributes and methods
- Class attributes can be made read-only or write-only
- It makes Java very flexible by changing one part of the code without affecting other part.

To protect data in encapsulation, the data must be private and only accessed through methods.

Here's an example code that creates public class variables that can be accessed within another class.

```java
public class Employee {
  String name;
  int age;
  int salary;
}
```

Since these are non-static variables, accessing them will require creating an object to access them within another class. In this case, "main".

```java
public class Main {
  public static void main(String[] args) {
    Employee emp = new Employee();
    emp.name = "John Doe";
    emp.age = 22;
    emp.salary = 1800;
  }
}
```

However, the variables of the Employee class are not encapsulated because they are directly accessible from the class. As stated earlier, these variables need to be marked with private modifiers to be encapsulated, and to modify these values, we'll utilize getters and setter methods.

```java
public class Employee {
  private String name;
  private int age;
  private int salary;

  // Name
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  // Id
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }

  // Salary
  public int getSalary() {
    return salary;
  }
  public void setSalary(int salary) {
    this.salary = salary;
  }
}
```

```java
public class Main {
  public static void main(String[] args) {
    Employee emp = new Employee();

    emp.setName("John Doe");
    emp.setId(104);
    emp.setSalary(150000);

    System.out.prinln("My name is " + emp.getName())
    System.out.prinln("My id is " + emp.getId())
    System.out.prinln("My salary is " + emp.getSalary())
  }
}
```

## Constructors

Constructors are special type of methods used for creating new objects. When you create a new class, Java assumes you want to create a constructor from that class, and automatically assigns a `no args` parameter to the constructor but you can update the parameters of the constructor by passing in a custom parameter or using getter and setter methods.

```java
public class Dogs {
  String name;
  int age;

  // Default no-args constructor.
  public Dogs() {}

  // Constructor with parameters for different values
  public Dogs(String name, int age) {
    this.name = name; // Assign the class variables to the constructor parameter values
    this.age = age;
  }
}
```

We can then access these values by passing in the arguments into the constructor object.

```java
public class Main {
  public static void main(String[] args) {
    Dog dog1 = new Dog("Bruno", 33);
    System.out.println("Name " + dog1.age + " Age " + dog1.age)

    Dog dog2 = new Dog("Matthew", 16);
    System.out.println("Name " + dog2.age + " Age " + dog2.age)
  }
}
```
