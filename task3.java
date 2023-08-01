import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class task3 {
    public static void main(String[] args) {
        try {
            Scanner fileScanner = new Scanner(new File("b1.txt"));
            Stack<String> lines = new Stack<>();

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                lines.push(line);
            }
            // Выводим строки на экран в обратном порядке
            while (!lines.empty()) {
                System.out.println(lines.pop());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
    }
}