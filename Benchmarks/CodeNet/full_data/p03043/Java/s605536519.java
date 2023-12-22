import java.util.Scanner;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // サイコロの面の数
        int K = sc.nextInt(); // 目標点

        double sum = 0;
        for (int n = 1; n <= N; n++) {
            if (K/n == 0) {
                sum += 1;
                continue;
            }
            double count = Math.log((double)K/n) / Math.log(2);
            if (!isInteger(count)) {
                count = Math.floor(count) + 1;
            }
            sum += Math.pow((double)1/2, count);
        }
        System.out.print(sum/N);
    }

    // 整数かどうかを調べる。
    boolean isInteger (double number) {
        return (number == Math.floor(number));
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}