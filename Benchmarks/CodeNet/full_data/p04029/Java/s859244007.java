import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Solver().solve(new Scanner(System.in));
//        new Solver().solve(new Scanner(ex));
    }

    private static final String ex = "3";
}

class Solver {
    Solver() {}

    void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.nextLine());

        System.out.println(N * (N + 1) / 2);
    }
}
