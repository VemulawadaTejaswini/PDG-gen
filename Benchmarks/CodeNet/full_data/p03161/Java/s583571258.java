import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
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

    public static void main(String[] args) {

    FastReader sc = new FastReader();

    int n = sc.nextInt();
    int k = sc.nextInt();

    int h[] = new int[n];
     int cost[] = new int[n];
        for(int i=0; i<n; i++){
         h[i] = sc.nextInt();
    }
        cost[0] = 0;
        cost[1] = Math.abs(h[1]-h[0]);
        for(int i=2; i<n; i++){
            cost[i] = Integer.MAX_VALUE;
            for(int j=i-1; j>=i-k && j>=0; j--){
                cost[i] = Math.min(cost[j]+Math.abs(h[i]-h[j]),cost[i]);
            }
        }
        System.out.println(cost[n-1]);
    }

}
