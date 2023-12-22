import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String S = sc.next();
        String T = sc.next();

        if (N % M == 0 || M % N == 0) {
            if (N > 26 || M > 26) {
                System.out.println(-1);
                return;
            }
            if (S.contains(T) || T.contains(S)) {
                System.out.println(-1);
                return;
            }
            int[] X = new int[26];
            for (int i = 0; i < N; i++) {
                X[S.charAt(i)] = S.charAt(i) - 'a';
            }
            for (int i = 0; i < M; i++) {
                if (X[T.charAt(i)] != 0) {
                    System.out.println(-1);
                    return;
                }
            }
        } else {
            System.out.println(lcm(N, M));
        }
        sc.close();

    }
    static long lcm (int a, int b) {
        int temp;
        long c = a;
        c *= b;
        while((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return c / b;
    }

}
