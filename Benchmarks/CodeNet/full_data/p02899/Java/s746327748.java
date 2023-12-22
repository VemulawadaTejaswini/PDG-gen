import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        String[] students = scanner.nextLine().split("\\s+");
        List<String> arr = new ArrayList<>(Arrays.asList(students));

        for (int i = 1; i <= N; i++) {
            System.out.print(arr.indexOf(String.valueOf(i)) + 1 + " ");
        }
    }
}
