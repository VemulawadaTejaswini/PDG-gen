import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long ANS = 1;
        for (int i = 1; i <= N; i++) {
            ANS = i * ANS % ((long) Math.pow(10, 9) + 7);
        }
        System.out.println(ANS);
    }
}