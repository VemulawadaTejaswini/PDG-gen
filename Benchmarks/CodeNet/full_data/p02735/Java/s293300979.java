import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int H = sc.nextInt();
        final int W = sc.nextInt();

        boolean[][] bord = new boolean[H][W];
        for (int i = 0; i < H; i++) {
            String row = sc.next();
            for (int j = 0; j < W; j++) {
                bord[i][j] = '.' == row.charAt(j);
            }

        }
        int minimum = Integer.MAX_VALUE;
        Deque<int[]> stack = new ArrayDeque<int[]>();
        stack.add(new int[] {0, 0, 0});
        while (!stack.isEmpty()) {
            int[] e = stack.pop();
            int r = e[0];
            int c = e[1];
            if (!bord[r][c]) {
                e[2] += 1;
            }
            if (r == H - 1 && c == W - 1) {
                minimum = e[2] < minimum ? e[2] : minimum;
                continue;
            }
            if (r + 1 < H) {
                int[] newArr = new int[3];
                System.arraycopy(e, 0, newArr, 0, 3);
                newArr[0] += 1;
                stack.add(newArr);
            }
            if (c + 1 < W) {
                int[] newArr = new int[3];
                System.arraycopy(e, 0, newArr, 0, 3);
                newArr[1] += 1;
                stack.add(newArr);
            }
        }
        System.out.println(minimum);
    }
}