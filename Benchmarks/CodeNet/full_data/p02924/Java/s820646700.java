import java.util.Arrays;
import java.util.Scanner;

class Solver {
    void solve(Scanner in) {
        int N = in.nextInt();
        int[] A = new int[N];
        Arrays.setAll(A, i -> i + 1);
        System.out.println(Arrays.stream(A, 0, N - 1).sum());
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}