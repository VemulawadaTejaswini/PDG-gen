import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class GridColoring80D {
    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner();
        int h = in.nextInt();
        int w = in.nextInt();
        int n = in.nextInt();
        ArrayList<Integer> numColors = new ArrayList<>();
        for (int i = 0; i < n; i++) numColors.add(in.nextInt());
        int curColor = 0;
        int[][] grid = new int[h][w];
        for (int i = 0; i < h; i += 2) {
            for (int j = 0; j < w; j++) {
                grid[i][j] = curColor + 1;
                numColors.set(curColor, numColors.get(curColor) - 1);
                if (numColors.get(curColor) == 0) curColor++;
            }
            if (i == h - 1) break;
            for (int j = w-1; j >= 0; j--) {
                grid[i+1][j] = curColor + 1;
                numColors.set(curColor, numColors.get(curColor) - 1);
                if (numColors.get(curColor) == 0) curColor++;
            }
        }
        
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextToken() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String nextLine() {
            st = null;
            try {
                return br.readLine();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return null;
        }

        int nextInt() {
            return Integer.parseInt(nextToken());
        }

        long nextLong() {
            return Long.parseLong(nextToken());
        }

        double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }
}
