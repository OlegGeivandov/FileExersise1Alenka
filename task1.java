import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class task1 {
    public static void main(String[] args) {
        String nameFile = "a1.txt";

        Scanner sc = null;
        try {
            sc = new Scanner(new File(nameFile));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(n1+n2);
    }
}
