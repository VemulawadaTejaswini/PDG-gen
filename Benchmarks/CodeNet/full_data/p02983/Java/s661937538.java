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
        long min = 2018;
        long i;
        long j;
        for (i = L; i < R; i++) {
            for (j = i + 1; j <= R; j++) {
                ans = (i * j) % 2019;
                if (min > ans) min = ans;
                if(min == 0) break;
            }
            if(min == 0) break;
        }

        System.out.println(min);
    }
}