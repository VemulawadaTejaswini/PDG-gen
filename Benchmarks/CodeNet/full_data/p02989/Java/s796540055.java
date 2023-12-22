import java.util.Arrays;
import java.util.Scanner;

class Solver {
    void solve(Scanner sc) {
        int N = sc.nextInt();
        int[] difficulty = new int[N];
        for (int i = 0; i < N; i++) {
            difficulty[i] = sc.nextInt();
        }
        Arrays.sort(difficulty);
        int a = difficulty[(difficulty.length - 1) / 2];
        int b = difficulty[(difficulty.length - 1) / 2 + 1];
        System.out.println(b - a);
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}