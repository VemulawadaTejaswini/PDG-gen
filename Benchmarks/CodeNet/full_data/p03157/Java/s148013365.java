import java.util.*;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        String[] S = new String[H];
        for (int i=0; i<H; i++) {
            S[i] = sc.next();
        }
        int ans = solve(H, W, S);

        System.out.println(ans);
    }

    private static int solve(int H, int W, String[] S) {
        int count = 0;

        for (int i=0; i<H; i++) {
            for (int j=0; j<W; j++) {
                if (S[i].charAt(j) == '.') continue;
                boolean[][] visited = new boolean[H][W];
                visited[i][j] = true;

                count += search(H, W, S, visited, i, j);
            }
        }

        return count;
    }

    private static int search(int H, int W, String[] S, boolean[][] visited, int h, int w) {
        int[] moveH = {0, -1, 0, 1};
        int[] moveW = {1, 0, -1, 0};
        int count = 0;

        for(int move=0; move<4; move++) {
            int nextH = h + moveH[move];
            int nextW = w + moveW[move];
            if(nextH < 0 || nextH == H) continue;
            if(nextW < 0 || nextW == W) continue;

            if (S[h].charAt(w) == S[nextH].charAt(nextW)) continue;
            if (visited[nextH][nextW]) continue;

            visited[nextH][nextW] = true;
            if (S[nextH].charAt(nextW) == '.') {
                count++;
            }

            count += search(H, W, S, visited, nextH, nextW);
        }

        return count;
    }
}
