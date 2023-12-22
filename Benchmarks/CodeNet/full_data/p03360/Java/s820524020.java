import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = Integer.parseInt(scanner.next());
        int B = Integer.parseInt(scanner.next());
        int C = Integer.parseInt(scanner.next());
        int K = Integer.parseInt(scanner.next());
        scanner.close();

        Integer[] arr = {A, B, C};
        Arrays.sort(arr, Comparator.reverseOrder());

        int sum = arr[1] + arr[2] + ((arr[0] * 2) * K);

        System.out.println(sum);
    }
}
