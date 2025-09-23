/**
 * In Java class can be defined as the *basic building blocks of Object-Oriented Programming*
 * Classes are used to create types, objects and define domain models.
 * can contain attribuites and methods
 *
 */


class Foo{
    //Atrributes
    String name;
    int age;

    //Constructor
    Foo(){}

}

// java file can only contain one public class
// the name of the public class must match the name of the file

public class Iclass {
    public static void main(String args[]) {
        // create an object of the class
        Foo foo = new Foo();
        foo.name = "John";
        foo.age = 30;
        System.out.println("Name: " + foo.name + ", Age: " + foo.age);
    }
}

/*
 * Class can't be defined inside a method or a function
 * class can't be defined with the name of a primitive data type ex: int, float, double, char, boolean or class
 */
