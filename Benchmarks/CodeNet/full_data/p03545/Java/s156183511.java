import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner();
        int n = in.nextInt();
        int d = n % 10;
        n /= 10;
        int c = n % 10;
        n /= 10;
        int b = n % 10;
        n /= 10;
        int a = n % 10;
        
        char x;
        char y;
        char z;
        if (a + b + c + d == 7) {
            x = '+';
            y = '+';
            z = '+';
        } else if (a + b + c - d == 7) {
            x = '+';
            y = '+';
            z = '-';
        } else if (a + b - c + d == 7) {
            x = '+';
            y = '-';
            z = '+';
        } else if (a + b - c - d == 7) {
            x = '+';
            y = '-';
            z = '-';
        } else if (a - b + c + d == 7) {
            x = '-';
            y = '+';
            z = '+';
        } else if (a - b + c - d == 7) {
            x = '-';
            y = '+';
            z = '-';
        } else if (a - b - c + d == 7) {
            x = '-';
            y = '-';
            z = '+';
        } else {
            x = '-';
            y = '-';
            z = '-';
        }
        System.out.print(a);
        System.out.print(x);
        System.out.print(b);
        System.out.print(y);
        System.out.print(c);
        System.out.print(z);
        System.out.println(d + "=7");
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