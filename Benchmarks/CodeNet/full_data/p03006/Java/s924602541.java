import java.io.*;
import java.util.*;

public class Main {

    static class Coord {
        int x;
        int y;

        public Coord(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Coord coord = (Coord) o;
            return x == coord.x &&
                    y == coord.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public static void main(String[] args) throws Exception {
        MyScanner scan = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        int n = scan.nextInt();
        int[][] coords = new int[n][2];
        HashSet<Coord> coordMap = new HashSet<>();
        for (int i = 0; i < n; i++) {
            coords[i][1] = scan.nextInt();
            coords[i][0] = scan.nextInt();
            coordMap.add(new Coord(coords[i][1], coords[i][0]));
        }
        HashMap<Coord, Integer> grads = new HashMap<>();
        Coord maxGrad = null;
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int deltaX = coords[i][1] - coords[j][1];
                int deltaY = coords[i][0] - coords[j][0];
                Coord coo = new Coord(deltaX, deltaY);
                grads.put(coo, grads.getOrDefault(coo, 0) + 1);
                if (maxCount < grads.get(coo)) {
                    maxCount = grads.get(coo);
                    maxGrad = coo;
                }
            }
        }
        if (maxGrad == null) {
            out.println(1);
        } else {
            for (int i = 0; i < n; i++) {
                int currX = coords[i][1];
                int currY = coords[i][0];
                Coord next = new Coord(currX + maxGrad.x, currY + maxGrad.y);
                while (coordMap.contains(next)) {
                    currX = currX + maxGrad.x;
                    currY = currY + maxGrad.y;
                    coordMap.remove(next);
                    next = new Coord(currX + maxGrad.x, currY + maxGrad.y);
                }
            }
            out.println(coordMap.size());
        }

        out.close();
    }

    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;

    //-----------MyScanner class for faster input----------
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
    //--------------------------------------------------------

}