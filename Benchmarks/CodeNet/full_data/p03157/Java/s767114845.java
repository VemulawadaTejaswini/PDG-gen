import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    private static class Pos {
        int i;
        int j;

        Pos(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    private static int solve(String[] S, int i, int j) {
        int H = S.length;
        int W = S[0].length();
        boolean[][] visited = new boolean[H][W];
        Stack<Pos> stack = new Stack<Pos>();
        stack.push(new Pos(i, j));

        int c = 0;

        while(!stack.isEmpty()) {
            Pos pos = stack.pop();
            if (visited[pos.i][pos.j]) continue;

            visited[pos.i][pos.j] = true;
            char ch = S[pos.i].charAt(pos.j);
            if (ch == '.') {
                c += 1;
            }

            if (pos.i - 1 >= 0 && !visited[pos.i-1][pos.j] && S[pos.i-1].charAt(pos.j) != ch) {
                stack.push(new Pos(pos.i-1, pos.j));
            }
            if (pos.i + 1 < H && !visited[pos.i+1][pos.j] && S[pos.i+1].charAt(pos.j) != ch) {
                stack.push(new Pos(pos.i+1, pos.j));
            }
            if (pos.j - 1 >= 0 && !visited[pos.i][pos.j-1] && S[pos.i].charAt(pos.j-1) != ch) {
                stack.push(new Pos(pos.i, pos.j-1));
            }
            if (pos.j + 1 < W && !visited[pos.i][pos.j+1] && S[pos.i].charAt(pos.j+1) != ch) {
                stack.push(new Pos(pos.i, pos.j+1));
            }
        }

        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();

        String[] S = new String[H];
        for(int i = 0; i < H; i++) {
            S[i] = sc.next();
        }

        int ans = 0;
        for(int i = 0; i < H; i++) {
            for(int j = 0; j < W; j++) {
                if (S[i].charAt(j) == '#') {
                    ans += solve(S, i, j);
                }
            }
        }

        System.out.println(ans);
    }
}
