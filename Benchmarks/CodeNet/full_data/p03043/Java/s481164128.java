import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = sc.nextLong();

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            long num = i;
            if (num < k) {
                int cnt = 0;
                do {
                    num *= 2;
                    cnt++;
                } while (num < k);
                sum += 1 / (double) n * Math.pow(0.5, cnt);
            } else {
                sum += 1 / (double) n;
            }
        }

        sc.close();

        System.out.println(sum);

    }
}