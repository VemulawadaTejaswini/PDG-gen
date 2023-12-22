import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        long max = Arrays.stream(arr).max().getAsLong();
        if (max % 2 == 0) {
            if (Arrays.stream(arr).allMatch(value -> value % 2 == 0)) {
                System.out.println("second");
            } else {
                System.out.println("first");
            }
        } else {
            System.out.println("first");
        }
    }
}