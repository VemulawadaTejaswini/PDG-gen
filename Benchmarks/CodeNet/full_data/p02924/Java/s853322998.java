import java.util.Scanner;
import java.util.stream.LongStream;

class Solver {
    void solve(Scanner in) {
        int N = in.nextInt();
        System.out.println(LongStream.rangeClosed(1, N - 1).sum());
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}
