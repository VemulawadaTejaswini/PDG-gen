import java.util.*;

public class Main {
//    private static final String ex = "0 75 25 100";
    private static final String ex = "10 90 20 80";

    public static void main(String[] args) {
        System.out.println(solve(new Scanner(System.in)));
//        System.out.println(solve(new Scanner(ex)));
    }

    private static int solve(Scanner scanner) {
        String[] split = scanner.nextLine().split(" ");

        int A = Integer.parseInt(split[0]);
        int B = Integer.parseInt(split[1]);
        int C = Integer.parseInt(split[2]);
        int D = Integer.parseInt(split[3]);

        if (B <= C || D <= A) return 0;
        else if (C <= A && B <= D) return B - A;
        else if (A <= C && D <= B) return D - C;
        else if (A <= C) return B - C;
        else if (C <= A) return D - A;
        else throw new RuntimeException();
    }
}
