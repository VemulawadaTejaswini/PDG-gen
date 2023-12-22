import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }


    static class Pos {
        int h;
        int w;

        Pos(int h, int w) {
            this.h = h;
            this.w = w;
        }

        int diff(Pos other) {
            return Math.abs(h - other.h) + Math.abs(w - other.w);
        }
    }

    static void solve(Scanner scanner) {
        int H = scanner.nextInt(), W = scanner.nextInt(), D = scanner.nextInt();
        scanner.nextLine();
        Map<Integer, Pos> m = new HashMap<>();
        for (int h = 0; h < H; h++){
            for (int w = 0; w < W; w++) {
                int n = scanner.nextInt();
                m.put(n, new Pos(h, w));
            }
        }
        scanner.nextLine();

        int[] cSum = new int[H * W + 1];
        for (int i = 1 + D; i < H * W + 1; i++) {
            cSum[i] = cSum[i - D] + m.get(i).diff(m.get(i - D));
        }

        int Q = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < Q; i++) {
            int[] q = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(cSum[q[1]] - cSum[q[0]]);
        }
    }

}