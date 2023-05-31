
// A simple Java program to demonstrate the use of reflection
import java.lang.reflect.*;

// class whose object is to be created
class Reflection {
    // creating a private field
    private String s;

    // creating a public constructor
    public Reflection() {
        s = "GeeksforGeeks";
    }

    // Creating a public method with no arguments
    public void method1() {
        System.out.println("The string is " + s);
    }

    // Creating a public method with int as argument
    public void method2(int n) {
        System.out.println("The number is " + n);
    }
}

class Demo {
    public static void main(String args[]) throws Exception {
        // Creating object whose property is to be checked
        Reflection obj = new Reflection();

        // Creating class object from the object using
        // getclass method
        Class cls = obj.getClass();
        System.out.println("The name of class is " +
                cls.getName());

        // Getting the constructor of the class through the
        // object of the class
        Constructor constructor = cls.getConstructor();
        System.out.println("The name of constructor is " +
                constructor.getName());

        System.out.println("The public methods of class are : ");

        // Getting methods of the class through the object
        // of the class by using getMethods
        Method[] methods = cls.getMethods();

        // Printing method names
        for (Method method : methods)
            System.out.println(method.getName());

        // creates object of desired method by providing the
        // method name and parameter class as arguments to
        // the getDeclaredMethod
        Method methodcall1 = cls.getDeclaredMethod("method2", int.class);

        // invokes the method at runtime
        methodcall1.invoke(obj, 19);

        // creates object of the desired field by providing
        // the name of field as argument to the
        // getDeclaredField method
        Field field = cls.getDeclaredField("s");

        // allows the object to access the field irrespective
        // of the access specifier used with the field
        field.setAccessible(true);

        // takes object and the new value to be assigned
        // to the field as arguments
        field.set(obj, "JAVA");

        // Creates object of desired method by providing the
        // method name as argument to the getDeclaredMethod
        Method methodcall2 = cls.getDeclaredMethod("method1");

        // invokes the method at runtime
        methodcall2.invoke(obj);

        // Creates object of the desired method by providing
        // the name of method as argument to the
        // getDeclaredMethod method
        Method methodcall3 = cls.getDeclaredMethod("method3");

        // allows the object to access the method irrespective
        // of the access specifier used with the method
        methodcall3.setAccessible(true);

        // invokes the method at runtime
        methodcall3.invoke(obj);
    }
}
/*
 * 
 * Output :
 * 
 * The name of class is Refelection
 * The name of constructor is Reflection
 * The public methods of class are :
 * method2
 * method1
 * wait
 * wait
 * wait
 * equals
 * toString
 * hashCode
 * getClass
 * notify
 * notifyAll
 * The number is 19
 * The string is JAVA
 * Private method invoked
 * Important observations :
 * 
 * We can invoke an method through reflection if we know its name and parameter
 * types. We use below two methods for this purpose
 * getDeclaredMethod() : To create an object of method to be invoked. The syntax
 * for this method is
 * Class.getDeclaredMethod(name, parametertype)
 * name- the name of method whose object is to be created
 * parametertype - parameter is an array of Class objects
 * invoke() : To invoke a method of the class at runtime we use following
 * method–
 * 
 * Method.invoke(Object, parameter)
 * If the method of the class doesn’t accepts any
 * parameter then null is passed as argument.
 * Through reflection we can access the private variables and methods of a class
 * with the help of its class object and invoke the method by using the object
 * as discussed above. We use below two methods for this purpose.
 * Class.getDeclaredField(FieldName) : Used to get the private field. Returns an
 * object of type Field for specified field name.
 * Field.setAccessible(true) : Allows to access the field irrespective of the
 * access modifier used with the field.
 * 
 * 
 * 
 * Advantages of Using Reflection:
 * 
 * Extensibility Features: An application may make use of external, user-defined
 * classes by creating instances of extensibility objects using their
 * fully-qualified names.
 * Debugging and testing tools: Debuggers use the property of reflection to
 * examine private members on classes.
 * 
 * 
 * Drawbacks:
 * 
 * Performance Overhead: Reflective operations have slower performance than
 * their non-reflective counterparts, and should be avoided in sections of code
 * which are called frequently in performance-sensitive applications.
 * Exposure of Internals: Reflective code breaks abstractions and therefore may
 * change behavior with upgrades of the platform.
 */