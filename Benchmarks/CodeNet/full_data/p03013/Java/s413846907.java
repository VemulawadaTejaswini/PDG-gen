import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int m = stdIn.nextInt();
        int a[] = new int[m];
        int b[] = new int[m + 1];
        long c = 1;
        for (int i = 0; i < a.length; i++)
            a[i] = stdIn.nextInt();
        Arrays.sort(a); // 昇順にソート
        b[0] = a[0];
        for (int i = 1; i < a.length; i++)
            b[i] = a[i] - a[i - 1] - 1;
        b[m] = n - a[m - 1];
        for (int i = 1; i < b.length; i++)
            b[i] = fib(b[i]);
        for (int i = 0; i < b.length; i++)
            c *= b[i];
        System.out.println(c % 1000000007);
    }

    private static int fib(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        return fib(num - 1) + fib(num - 2);
    }

}
