import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try {
            int[] array = readArray("a2.txt");
            double a = calcAverage(array);
            System.out.println("Среднее арифметическое: " + a);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
    }

    static int[] readArray(String fname) throws FileNotFoundException
    {
        Scanner fileScanner = new Scanner(new File(fname));
        int arrayLength = fileScanner.nextInt();
        fileScanner.nextLine();

        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = fileScanner.nextInt();
        }
        return array;
    }

    static double calcAverage(int[] array){
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = sum / array.length;
        return average;
    }
}