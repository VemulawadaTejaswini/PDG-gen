import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String S = sc.next();
        String T = sc.next();

        int L = lcm(N, M);

        char[] X = new char[L + 1];

        for (int i = 0; i < N; i++) {
            X[i * (L / N) + 1] = S.charAt(i);
        }

        for (int i = 0; i < M; i++) {
            if (X[i * (L / M) + 1] != 0) {
                if (X[i * (L / M) + 1] != T.charAt(i)) {
                    System.out.println(-1);
                    return;
                }
            }
        }

        System.out.println(L);

        sc.close();

    }
    static int lcm (int a, int b) {
        int temp;
        long c = a;
        c *= b;
        while((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return (int)(c / b);
    }

}
