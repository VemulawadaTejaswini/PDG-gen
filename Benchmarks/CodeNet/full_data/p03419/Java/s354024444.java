import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n > m) {
            int tmp = n;
            n = m;
            m = tmp;
        }

        long ans = 0;

        if (n == 1) {
            if (m == 1)
                ans = 1;
            else
                ans = m - 2;
        } else {
            ans = (n - 2) * (m - 2);
        }

        System.out.println(ans);
    }
}