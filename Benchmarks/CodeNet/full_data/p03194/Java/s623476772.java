import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long p = sc.nextLong();
        long ans = 1;

        for (long i = 1; Math.pow(i, n) <= p; i++) {
            long tag = p;
            boolean flag = true;
            for (long j = 0; j < n; j++) {
                if (tag % i != 0) {
                    flag = false;
                    break;
                } else {
                    tag = tag / i;
                }
            }
            if (flag) {
                ans = i;
            }
        }
        System.out.println(ans);

    }
}