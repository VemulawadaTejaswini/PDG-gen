
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum = 0;
        long max = -1;
        for (int i = 0; i < n; ++i) {
            int a = scanner.nextInt();
            max = Math.max(max, a);
            sum += a;
        }
        sum -= max;
        if (max < sum) {
            System.out.println("Yes");
        } else {
           System.out.println("No");
        }
    }
}
