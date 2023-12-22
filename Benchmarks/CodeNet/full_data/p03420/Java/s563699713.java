import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        long count = 0;
        if (k == 0) {
            System.out.println(n*n);
        } else {
            for (int y = k + 1; y <= n; y++) {
                count += (n / y) * (y - k);
                if (n % y >= k) {
                    count += n % y - k + 1;
                }
            }
            System.out.println(count);
        }
    }
}
