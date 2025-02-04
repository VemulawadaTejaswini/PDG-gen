import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main implements Runnable {
    public static void Sieve(int n)throws Exception {
        boolean[] prime = new boolean[n / 2];
        Arrays.fill(prime, false);

        for (int i = 3; i * i < n; i += 2) {
            if (!prime[i / 2]) {
                for (int j = i * i; j < n; j += i * 2) {
                    prime[j / 2] = true;
                }
            }
        }


        //System.out.println("2");

        int p = 1;
        for (int i = 3; i < n; i += 2) {
            if (!prime[i / 2]) {

            }
        }
    }

    public static boolean isPal(String s){
        int len = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!=s.charAt(len-1)){
                return false;
            }
            len--;
        }
        return true;
    }
    public void solve() throws Exception {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
           String s = sc.next();
           int len = s.length();
           String s1 = s.substring(0,((len-1)/2));
           String s2 = s.substring(((len+1)/2));

           boolean flag1 = isPal(s);
           boolean flag2 = isPal(s1);
           boolean flag3 = isPal(s2);

        if (flag1 && flag2 && flag3){
            out.println("YES");
        }else
            out.println("NO");


    }


    //main function//
    public static PrintWriter out;

    public static void main(String[] args) throws Exception {
        new Thread(null, new Main(), "", 1 << 26).start();
    }

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

        boolean hasNextInt() {
            return true;
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

    public void run() {
        try {
            solve();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        } finally {
            out.close();
        }
    }
}