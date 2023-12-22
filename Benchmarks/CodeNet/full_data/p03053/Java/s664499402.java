import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }


    public static void main(String[] args) {
        MyScanner in = new MyScanner();
        int n = in.nextInt();
        int m = in.nextInt();
        char[][] board = new char[n][];
        for(int i = 0; i < n; i++) {
            String s = in.next();
            board[i] = s.toCharArray();
        }

        Queue<Integer> next = new ArrayDeque<>();
        int[][] moves = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if (board[i][j] == '.') {
                    moves[i][j] = 10000000;
                } else {
                    next.add(i * m + j);
                }
            }
        }
        int ret = 0;
        final int[] di = new int[]{-1, 0, 1, 0};
        final int[] dj = new int[]{0, 1, 0, -1};
        while(!next.isEmpty()) {
            int x = next.poll();
            int i = x / m;
            int j = x % m;
//            System.out.println(i + " " + j + " " + moves[i][j]);
            for(int k = 0; k < 4; k++) {
                int ii = i + di[k];
                int jj = j + dj[k];
                if (ii < 0 || ii >= n || jj < 0 || jj >= m) continue;
                if (board[ii][jj] == '#') continue;
                moves[ii][jj] = moves[i][j] + 1;
                board[ii][jj] = '#';
                next.add(ii * m + jj);
                ret = Math.max(ret, moves[ii][jj]);
            }
        }
        System.out.println(ret);
    }
}
