import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());

        double result = 0;
        if (n < k) {
            for (int i = 1; i <= n; i++) {
                int count = 0;
                int num = i;
                while (num < k) {
                    num *= 2;
                    count++;
                }
                result += 1.0 / (Math.pow(2, count));
            }
            result /= n;
        } else {
            for (int i = 1; i < k; i++) {
                int count = 0;
                int num = i;
                while (num < k) {
                    num *= 2;
                    count++;
                }
                result += 1.0 / (Math.pow(2, count));
            }
            result /= n;
            int win = n - k + 1;
            result += 1.0 * win / n;
        }

        System.out.println(result);
    }
}