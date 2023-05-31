import java.util.Scanner;

public class Fac {

    static private int fact = 1;
    static private int i;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scan.nextInt();
        scan.close();
        System.out.println("The factorial of " + num + " is");
        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("fac" + fact);
    }
}

