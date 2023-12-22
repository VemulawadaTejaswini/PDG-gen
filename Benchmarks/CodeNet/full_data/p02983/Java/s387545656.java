
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        long L = scanner.nextInt();
        long R = scanner.nextInt();
        long ans = 0;
        long min = Long.MAX_VALUE;
        long i;
        long j;
        long mul;
        for (i = L; i < R; i++) {
            mul = i * i;
            for (j = i + 1; j <= R; j++) {
                mul += i;
                ans = mul % 2019;
                if (min > ans) min = ans;
            }
            if(min == 0) break;
        }

        System.out.println(min);
    }
}