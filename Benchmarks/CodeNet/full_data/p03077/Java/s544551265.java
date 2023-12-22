import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long min = Long.MAX_VALUE;

        long n = sc.nextLong();
        for (int i = 0; i < 5; i++) {
            long a = sc.nextLong();
            min = Math.min(a, min);
        }

        long ans = 0;
        if (n <= min)
            ans = 5;
        else
            ans = n / min + 5;

        System.out.println(ans);
    }
}
