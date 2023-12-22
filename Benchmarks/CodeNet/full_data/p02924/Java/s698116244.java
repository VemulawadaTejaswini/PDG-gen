import java.util.Scanner;

class Solver {
    void solve(Scanner in) {
        int N = in.nextInt();
        System.out.println(N * (N - 1L) / 2L);
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}
