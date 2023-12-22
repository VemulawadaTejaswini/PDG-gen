import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            result += factor2(a[i]);
        }


        System.out.println(result);


    }

    public static int factor2(int f) {
        int cnt = 0;
        while (true) {
            if (f % 2 == 0) {
                f = f/2;
                cnt++;
            } else {
                return cnt;
            }
        }
    }
}