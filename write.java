
import java.io.IOException;
import java.io.FileInputStream;

public class write {
    public static void main(String[] args) throws IOException {
        FileInputStream f = new FileInputStream("Tes.txt");
        int i;
        while ((i = f.read()) != -1) {
            System.out.println((char) i);
        }

        f.close();

    }

}
