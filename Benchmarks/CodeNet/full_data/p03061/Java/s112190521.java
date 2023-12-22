import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A[] = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int L[] = new int[N];
        int R[] = new int[N];

        L[0] = 0;
        R[N-1] = 0;
        for (int i = 1; i < N; i++) {
            L[i] = gcd(A[i - 1], L[i - 1]);
            R[N - 1 - i] = gcd(A[N - i], R[N - i]);
        }

        int maxGcd = 0;
        for (int i = 0; i < N; i++) {
            int gcd = gcd(L[i], R[i]);
            if (maxGcd < gcd) maxGcd = gcd;
        }

        System.out.println(maxGcd);
    }

    public static int gcd(int a, int b) {
        if (b > a) {
            int tmp = b;
            b = a;
            a = tmp;
        }
        if (b == 0) return a;
        else {
            int i = a % b;
            return gcd(b, i);
        }
    }
}
