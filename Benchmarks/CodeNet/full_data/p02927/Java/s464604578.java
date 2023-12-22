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
            int lower = days % 10;
            int upper = days / 10;
            if (upper < 2){
                out.println(0);
                return;
            }
            int[] table = new int[(upper - 2) * 8 + (lower >= 2 ? lower - 1 : 0)];
            for (int i = 2; i < upper; i++) {
                for (int j = 2; j <= 9; j++) {
                    table[(i - 2) * 8 + j - 2] = i * j;
                }
            }
            if (lower >= 2) for (int j = 2; j <= lower; j++) {
                table[(upper - 2) * 8 + j - 2] = upper * j;
            }
            int counter = 0;
            Arrays.sort(table);
            for (int month = months; month > 0; month--) {
                int idx = Arrays.binarySearch(table, month);
                if (idx < 0) continue;
                for (; idx < table.length; idx++) {
                    if (idx != month) break;
                }
                counter = idx;
                break;
            }
            out.println(counter + 1);
        }
    }
}