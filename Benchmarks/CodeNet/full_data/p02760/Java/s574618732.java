import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Solver solver = new Solver();
        solver.solve(in, out);
        out.close();
    }

    static class Solver {
        public void solve(Scanner in, PrintWriter out) {
            boolean[][] bingo = new boolean[3][3];
            Map<Integer, String> nums = new HashMap<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int a = in.nextInt();
                    nums.put(a, i + ":" + j);
                    bingo[i][j] = false;
                }
            }
            int N = in.nextInt();

            for (int i = 0; i < N; i++) {
                int b = in.nextInt();
                String exists = nums.get(b);
                if (exists != null) {
                    String[] indexes = exists.split(":");
                    bingo[Integer.parseInt(indexes[0])][Integer.parseInt(indexes[1])] = true;
                }
            }

            if (
                (bingo[0][0] && bingo[0][1] && bingo[0][2]) ||
                (bingo[1][0] && bingo[1][1] && bingo[2][2]) ||
                (bingo[2][0] && bingo[2][1] && bingo[2][2]) ||
                (bingo[0][0] && bingo[1][0] && bingo[2][0]) ||
                (bingo[0][1] && bingo[1][1] && bingo[2][1]) ||
                (bingo[0][2] && bingo[1][2] && bingo[2][2]) ||
                (bingo[0][0] && bingo[1][1] && bingo[2][2]) ||
                (bingo[0][2] && bingo[1][1] && bingo[0][2])
            ) {
                out.println("Yes");
            }
            else {
                out.println("No");
            }
        }
    }
}