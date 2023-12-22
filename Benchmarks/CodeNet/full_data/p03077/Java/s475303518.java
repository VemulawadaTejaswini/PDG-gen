import java.util.Arrays;
import java.util.Scanner;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long[] numbers = new long[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextLong();
        }

        Arrays.sort(numbers);
        long min = numbers[0];

        long waitTime = 0;
        if ((N % min) == 0) {
            waitTime = N / min - 1;
        }
        else {
            waitTime = N / min;
        }

        long ans = waitTime + 5;
        System.out.print(ans);
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}