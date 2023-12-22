import java.io.*;
import java.util.*;
public class Main {
    private static MyScanner scanner;

    public static void main (String[] args){
        Main instance = new Main();
        scanner = instance.new MyScanner();
        instance.solve();
    }

    private void solve() {
        try {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int[] a = new int[N];
            int[] b = new int[N];
            int[] c = new int[M];
            int[] d = new int[M];
            for (int i = 0; i < N; i++) {
                a[i] = scanner.nextInt();
                b[i] = scanner.nextInt();
            }
            for (int i = 0; i < M; i++) {
                c[i] = scanner.nextInt();
                d[i] = scanner.nextInt();
            }

            for (int i = 0; i < N; i++) {
                long min = Long.MAX_VALUE;
                int minIndex = 0;
                for (int j = 0; j < M; j++) {
                    long manhattan = Math.abs(a[i] - c[j]) + Math.abs(b[i] - d[j]);
                    if (manhattan < min) {
                        min = manhattan;
                        minIndex = j;
                    }
                }
                System.out.println(minIndex + 1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
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