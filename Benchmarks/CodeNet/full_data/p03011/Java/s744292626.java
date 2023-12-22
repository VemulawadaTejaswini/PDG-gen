import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int P = Integer.parseInt(scanner.next());
        int Q = Integer.parseInt(scanner.next());
        int R = Integer.parseInt(scanner.next());
        scanner.close();

        int[] arr = {P, Q, R};
        Arrays.sort(arr);

        System.out.println(arr[0] + arr[1]);
    }
}
