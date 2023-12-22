import java.util.*;

public class Main {
    private static Integer res= 0;
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int[][] maze = new int[h][w];
        for (int i = 0; i < h; i++) {
            String s = scanner.next();
            int point = 0;
            for (char c : s.toCharArray()) {
                if (c == '.') maze[i][point] = 0;
                if (c == '#') maze[i][point] = 1;
                point++;
            }
        }

        res = h + w - 1;
        int first = maze[0][0] == 0 ? 0 : 1;
        dfs(0,0,h-1,w-1,first, maze);
        System.out.println(res);
    }

    private static void dfs(int curH, int curW, int h, int w, int count,  int[][] maze) {
        if (curH == h && curW == w) {
            res = Math.min(res, count);
            return;
        }

        if (count >= res) return;

        if (curH < h) {
            int plus = 0;
            if (maze[curH+1][curW] == 1) plus = 1;
            dfs(curH + 1, curW, h, w, count + plus,  maze);
        }

        if (curW < w) {
            int plus = 0;
            if (maze[curH][curW+1] == 1) plus = 1;
            dfs(curH, curW+1, h, w, count + plus, maze);
        }
    }
}