import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        try {
            Scanner fileScanner = new Scanner(new File("a2.txt"));
            int arrayLength = fileScanner.nextInt();
            fileScanner.nextLine();

            int[] array = new int[arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                array[i] = fileScanner.nextInt();
            }
            double sum = 0;
            for (int num : array) {
                sum += num;
            }
            double average = sum / arrayLength;
            System.out.println("Среднее арифметическое: " + average);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
    }
}