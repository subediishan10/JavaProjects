import java.util.ArrayList;

//This is for the integer 2D array
/*
class D2_array {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of the matrix");
        int r = sc.nextInt();
        System.out.println("Enter the column of the matrix");
        int c = sc.nextInt();
        int[][] a = new int[r][c];

        // Get input from the user
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Displaying as the data are inputed from the user
        System.out.println("Elements present in an array are given below with given matrices");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();

    }
}
*/

//This is for the string input from the user
/*
class D2_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] a = new String[3][4];
        System.out.println("Entered strings");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = sc.nextLine();
            }
        }
        System.out.println("entered matrix are");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }

        sc.close();

    }
}
*/
//Array list

class D2_array {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();
        food.add("Pizza");
        food.add("Burger");
        food.add("pizza");

        food.set(0, "Ishan");
        food.remove(2);

        for (int i = 0; i < food.size(); i++) {

            System.out.println(food.get(i));
        }
    }

}