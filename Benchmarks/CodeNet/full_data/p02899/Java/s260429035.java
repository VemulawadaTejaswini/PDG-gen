import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        String[] students = scanner.nextLine().split("\\s+");

        for (int i = 1; i <= N; i++) {
            int temp = 1 + Arrays.asList(students).indexOf(String.valueOf(i));
            System.out.print(temp + " ");
        }
    }
}
