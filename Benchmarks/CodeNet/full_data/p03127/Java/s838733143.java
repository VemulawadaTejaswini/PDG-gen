import java.util.Scanner;

class Problem {
    private int N;
    private int[] A;

    Problem() {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
    }

    int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    int solve() {
        int g = A[0];
        for (int i = 1; i < N; i++) {
            g = gcd(Math.max(g, A[i]), Math.min(g, A[i]));
        }

        return g;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Problem().solve());
    }
}
