import java.util.Scanner;

/**
 * Station and Bus
 * 
 * https://atcoder.jp/contests/abc158/tasks/abc158_a
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();

        long m = N / (A + B);

        long ans = A * m + Math.min(A, N - (A + B) * m);

        System.out.println(ans);
    }

}
