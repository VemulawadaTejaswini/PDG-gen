import java.io.*;
import java.util.*;
public class Main {
    private static MyScanner scanner;
    private int N;
    private String s;

    public static void main (String[] args){
        Main instance = new Main();
        scanner = instance.new MyScanner();
        instance.solve();
    }

    private void solve() {
        try {
            N = scanner.nextInt();
            s = scanner.next();
            int[] circle = new int[N];
            int[] pair1 = {1, 1, 2, 2};
            int[] pair2 = {1, 2, 1, 2};
            boolean success = false;
            int i = 0;
            while (!success && i < 4) {
                circle[0] = pair1[i];
                circle[1] = pair2[i];
                if (isM(circle)) {
                    printCircle(circle);
                    success = true;
                }
                i++;
            }
            if (!success) {
                System.out.println(-1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void printCircle (int[] circle) {
        for (int i = 0; i< N; i++) {
            if (circle[i] == 1) {
                System.out.print("S");
            } else {
                System.out.print("W");
            }
        }
        System.out.println();
    }

    private boolean isM (int[] circle) {
        boolean success = false;
        for (int i = 1; i < N-1; i++) {
            String ox = s.substring(i, i+1);
            if ((circle[i]==1 && ox.equals("o")) || (circle[i]==2 && ox.equals("x"))) {
                circle[i+1] = circle[i-1];
            }
            if ((circle[i]==1 && ox.equals("x")) || (circle[i]==2 && ox.equals("o"))) {
                circle[i+1] = circle[i-1] == 1 ? 2 : 1;
            }
        }
        String last = s.substring(s.length()-1);
        if (circle[0] == circle[N-2]) {
            if ((circle[N-1]==1 && last.equals("o")) || (circle[N-1]==2 && last.equals("x"))) {
                success = true;
            }
        }
        if (circle[0] != circle[N-2]) {
            if ((circle[N-1]==1) && last.equals("x") || (circle[N-1]==2 && last.equals("o"))) {
                success = true;
            }
        }
        return success;
    }

    private class MyScanner {
        String[] s;
        int i;
        BufferedReader br;
        String reg = " ";

        MyScanner () {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next() throws IOException {
            if (i < s.length) return s[i++];
            String line = br.readLine();
            while (line.equals("")) {
                line = br.readLine();
            }
            s = line.split(reg, 0);
            i = 0;
            return s[i++];
        }

        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }

        public double nextDouble() throws NumberFormatException, IOException {
            return Double.parseDouble(next());
        }

        public long nextLong() throws NumberFormatException, IOException {
            return Long.parseLong(next());
        }
    }
}