import java.io.*;
import java.util.*;

public class Main {
    public static PrintWriter out;
    public static FastScanner in;

    private void solve() {
        int sx = in.nextInt();
        int sy = in.nextInt();

        int tx = in.nextInt();
        int ty = in.nextInt();

        String ans = "";
        for(int i=0;i<ty-sy;i++){
            ans+='U';
        }
        for(int i=0;i<tx-sx;i++){
            ans+='R';
        }
        for(int i=0;i<ty-sy;i++){
            ans+='D';
        }
        for(int i=0;i<tx-sx;i++){
            ans+='L';
        }


        ans+='L';
        for(int i=0;i<=ty-sy;i++){
            ans+='U';
        }
        for(int i=0;i<=tx-sx;i++){
            ans+='R';
        }
        ans+="DR";
        for(int i=0;i<=ty-sy;i++){
            ans+='D';
        }
        for(int i=0;i<=tx-sx;i++){
            ans+='L';
        }
        ans+='U';
        out.print(ans);
    }

    private void runIO() {
        in = new FastScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        solve();
        out.close();
    }
    private static class FastScanner {
        BufferedReader bufferedReader;
        StringTokenizer stringTokenizer;

        private FastScanner() {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        }

        private String next() {
            if (stringTokenizer == null || !stringTokenizer.hasMoreElements()) {
                try {
                    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return stringTokenizer.nextToken();
        }

        private int nextInt() {
            return Integer.parseInt(next());
        }

        private long nextLong() {
            return Long.parseLong(next());
        }

        private String nextLine() {
            String ret = "";
            try {
                ret = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return ret;
        }
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}
