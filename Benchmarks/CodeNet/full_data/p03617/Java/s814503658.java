import java.util.*;

class A {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int Q = sc.nextInt();
        final int H = sc.nextInt();
        int S = sc.nextInt();
        int D = sc.nextInt();
        final int N = sc.nextInt();
        S = Math.min(S, 2 * Math.min(H, 2 * Q));
        D = Math.min(D, 2 * S);
        System.out.println((long) N / 2 * D + N % 2 * S);
    }
}
public class Main {
    public static void main(String... args) {
        A.main();
    }
}