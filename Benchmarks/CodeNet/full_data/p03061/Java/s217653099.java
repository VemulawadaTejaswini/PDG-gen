import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A[] = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int gcd;
        int maxGcd = 0;
        boolean skipFlg;

        for (int i = 0; i < N; i++) {
            skipFlg = false;
            int begin = (i != 0) ? 0 : 1;
            gcd = A[begin];

            for (int j = begin; j < N; j++) {
                if (j == i) continue;
                gcd = gcd(gcd, A[j]);
                if (maxGcd >= gcd) {
                    skipFlg = true;
                    continue;
                }
            }

            if (!skipFlg) maxGcd = gcd;
        }

        System.out.println(maxGcd);
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        else {
            int i = a % b;
            return gcd(b, i);
        }
    }
}
