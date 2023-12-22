import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long N = in.nextLong();
        long K = in.nextLong();

        if (K == 1) {
            System.out.println(K);
            return;
        }

        long slow = N;
//        long fast = absoluteDiff(absoluteDiff(N, K), K);
        long min = slow;
        do {
//            min = Math.min(Math.min(min, slow), fast);
            slow = absoluteDiff(slow, K);
            min = Math.min(min, slow);
//            fast = absoluteDiff(absoluteDiff(fast, K), K);
        } while (slow != N);

        System.out.println(min);

    }

    public static long absoluteDiff(long a, long b) {
        return Math.abs(a - b);
    }

}