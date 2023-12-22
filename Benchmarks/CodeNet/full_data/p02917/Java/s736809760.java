import java.util.Scanner;

class Solver {
    void solve(Scanner sc) {
        int N = sc.nextInt();
        int[] B = new int[N + 1];
        B[0] = B[N] = Integer.MAX_VALUE;
        for (int i = 1; i < N; i++) {
            B[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < B.length - 1; i++) {
            int limit = Math.min(B[i], B[i + 1]);
            sum += limit;
        }
        System.out.println(sum);
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}