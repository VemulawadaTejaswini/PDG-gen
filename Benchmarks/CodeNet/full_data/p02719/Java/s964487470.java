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
        long fast = absoluteDiff(absoluteDiff(N, K), K);

        long min = slow;
        while (slow != fast) {
            min = Math.min(Math.min(min, slow), fast);
            slow = absoluteDiff(slow, K);
            fast = absoluteDiff(absoluteDiff(fast, K), K);
        }

        System.out.println(min);

    }

    public static long absoluteDiff(long a, long b) {
        return Math.abs(a - b);
    }

}