
import java.io.*;
import java.util.*;

class Employee implements Serializable {
    int emno;
    String ename;
    int sal;

    Employee(int emno, String ename, int sal) {
        this.emno = emno;
        this.ename = ename;
        this.sal = sal;
    }

    public String toString() {
        return emno + " " + ename + " " + sal;
    }
}

class EmployeeDemo {
    public static void main(String[] args) throws Exception {
        int choice = 1;
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        File file = new File("Employee.txt");
        ArrayList<Employee> al = new ArrayList<Employee>();
        ObjectOutputStream oos = null;

        do {
            System.out.println("1.Insert");
            System.out.println("2.Display");
            System.out.println("0.Exit");
            System.out.println("Enter your choice: ");
            choice = s.nextInt();
            switch (choice) {
                case 1:

                    System.out.println("Enter how many employees you want :");
                    int n = s.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Enter Employee No: ");
                        int emno = s.nextInt();

                        System.out.println("Enter Employee name: ");
                        String ename = s1.nextLine();

                        System.out.println("Enter salary: ");
                        int esal = s.nextInt();

                        al.add(new Employee(emno, ename, esal));

                    }
                    oos = new ObjectOutputStream(new FileOutputStream(file));
                    oos.writeObject(al);
                    oos.close();
                    break;
                case 2:
                    System.out.println(al);
                    break;
            }
        } while (choice != 0);
        s.close();
        s1.close();
    }

}
