import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String args[]) throws IOException {
        FastReader s = new FastReader();
        int n = s.nextInt();
        int a[][] = new int[2][n];
        for(int i=0;i<2;i++){
            for(int j=0;j<n;j++){
                a[i][j] = s.nextInt();
            }
        }
        int t = 0, b = 0;
        for(int j = 0; j<n ; j++){
            t += a[0][j];
            b += a[1][j];
        }
        b += a[0][0];
        int ans = 0;
        int flag=0;
        for(int i=0;i<n-1;i++){
            if(b>=t){
                ans+=b;
                flag = 1;
                break;
            }
            ans += a[0][i];
            b = b - a[0][i] - a[1][i] + a[0][i+1] + a[1][i+1];
            t = t - a[0][i] + a[0][i+1];
        }
        if(flag==0){
            ans = ans + a[0][n-1] + a[1][n-1];
        }
        System.out.println(ans);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
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
