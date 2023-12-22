import java.util.Scanner;

class Solver {
    void solve(Scanner in) {
        final int N = in.nextInt();
        final int T = in.nextInt();
        int time = -T;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int timing = in.nextInt();
            sum += T - Math.max((time + T) - timing, 0);
            time = timing;
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