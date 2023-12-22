import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int total = 0;
        for (int i = 1; i <= n; i++) {
            int cand = sumByDigit(i);
            if (cand >= a && cand <= b) {
                total += i;
            }
        }

        System.out.println(total);
    }

    static int sumByDigit(int n) {
        int total = 0;
        while (n > 0) {
            total += n % 10;
            n /= 10;
        }
        return total;
    }
}
