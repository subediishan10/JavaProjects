
import java.util.InputMismatchException;
import java.util.Scanner;

class Handling {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{

        System.out.println("Enter a number");
        
            int a = s.nextInt();
            System.out.println("Enter a number");
            int b = s.nextInt();
            int ans = a / b;
            System.out.println("Answer is\n" + ans);
            s.close();
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by 0");
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Please enter only numbers");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
