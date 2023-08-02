import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isOK  = false;
        while (! isOK) {
            System.out.println("откуда брать данные?");
            String nameFile = scanner.nextLine().trim();
            Scanner sc = null;
            try {
                sc = new Scanner(new File(nameFile));
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                System.out.println(n1 + n2);
                isOK = true;
            } catch (FileNotFoundException e) {
                System.out.println("все ужасно, файл не найден");
                isOK = false;
            }
            catch (Exception e){
                System.out.println("файл найден, и все равно все плохо");
                isOK = false;
            }
        }


    }
}
