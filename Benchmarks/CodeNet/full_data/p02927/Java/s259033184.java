import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        new Solver().solve(in, out);

        in.close();
        out.flush();
    }

    private static class Solver {
        public void solve(Scanner in, PrintWriter out) {
            int months = in.nextInt();
            int days = in.nextInt();
            int counter = 0;
            for (int day = 20; day < days; day++) {
                int lower = day % 10;
                int upper = day / 10;
                if (lower < 2) continue;
                int mul = lower * upper;
                for (int month = 1; month < months; month++) {
                    if (month != mul) continue;
                    counter++;
                }
            }
            out.println(counter);
        }
    }
}