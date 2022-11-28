import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        try {
            Scanner scanner = new Scanner(new File("in.txt"));
            int a = scanner.nextInt();
            System.out.println(a);

            int[] mas = new int[a];
            for (int i = 0; i < mas.length; i++) {
                mas[i] = scanner.nextInt();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}