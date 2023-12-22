import java.awt.Point;
import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
    static class Solver {
        public void solve(MyReader in, PrintWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();

            char[][] maze = new char[h][w];

            for (int i = 0; i < h; i++) {
                maze[i] = in.next().toCharArray();
            }

            Queue<List<Integer>> q = new ArrayDeque<>();
            q.add(Arrays.asList(0,0,maze[0][0] == '#'?1:0));

            int res = 100000;
            while (!q.isEmpty()){
                List<Integer> cur = q.poll();
                int x = cur.get(0);
                int y = cur.get(1);
                int cost = cur.get(2);
                if (x == h-1 && y == w-1){
                    res = Math.min(res,cost);
                }

                //right
                int ny = y+1;
                if(ny < w){
                    q.add(Arrays.asList(x,ny,maze[x][ny] == '#'?cost+1:cost));
                }

                int nx = x+1;
                if(nx < h){
                    q.add(Arrays.asList(nx,y,maze[nx][y] == '#'?cost+1:cost));
                }

            }

            out.println(res);


        }


    }

    public static void main(String[] args) {
        MyReader mr = new MyReader();
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        new Solver().solve(mr, out);
        out.close();
    }

    //    static int[][] dir = {{0,1}, {1,0},{-1,0}, {0,-1}};
//    static int[][] dir = {{0,1}, {1,0},{-1,0}, {0,-1}, {-1,-1},{-1,1}, {1,1}, {1,-1}};
    static class MyReader {
        BufferedReader br;
        StringTokenizer st;

        MyReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (Exception e) {
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

        String nextLine() {
            String res = "";
            try {
                res = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return res;
        }

        int[] nextIntArray(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextInt();
            }

            return arr;
        }

        Integer[] nextIntegerArray(int n) {
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextInt();
            }

            return arr;
        }

        Long[] nextLongArray(int n) {
            Long[] arr = new Long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextLong();
            }

            return arr;
        }

        String[] nextStringArray(int n) {
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = next();
            }
            return arr;
        }
    }

    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}


