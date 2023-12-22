import java.util.Scanner;

public class Main {
    int[] dp = new int[100001];
    int X = 0;

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        X = scanner.nextInt();

        // 初期条件
        dp[0] = 0;

        // ループ
        d(0);

        System.out.println(dp[X]);
    }

    private boolean d(int i) {
        if (i > X) {
            return false;
        }

        if(dp[i] == 1) return false;

        if (i != 0) {
            dp[i] = 1;
        }

        d(i + 105);
        d(i + 104);
        d(i + 103);
        d(i + 102);
        d(i + 101);
        d(i + 100);

        return false;
    }


}