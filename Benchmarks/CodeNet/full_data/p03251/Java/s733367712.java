
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        Integer[] xArr = new Integer[n];
        Arrays.fill(xArr, 0);
        int[] yArr = new int[m];
        for (int i = 0; i < xArr.length; i++) {
            xArr[i] = sc.nextInt();
        }

        for (int i = 0; i < yArr.length; i++) {
            yArr[i] = sc.nextInt();
        }
        Arrays.sort(xArr, (e1, e2) -> e2 - e1);
        Arrays.sort(yArr);

        int tarx = xArr[0];
        int tary = yArr[0];

        for (int i=tarx+1;i <=tary;i++) {
            if (x < i && i <=y) {
                out.println("No War");
                out.flush();
                return;
            }
        }

        out.println("War");

        out.flush();

    }

    static class Toi {
        public int x;
        public int y;

        public Toi(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }

            if (this == obj) {
                return true;
            }

            if (this.getClass() != obj.getClass()) {
                return false;
            }

            Toi toi = (Toi) obj;
            return x == toi.x && y == toi.y;
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
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

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}