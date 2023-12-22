import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] a = new int[n+1]; for(int i=0; i<n; i++) a[i+1] = Integer.parseInt(st.nextToken());
        boolean[] in = new boolean[n+1];
        Arrays.fill(in, true);
        for(int i=n; i>=1; i--) {
          long cur_sum = 0;
          for(int j=i; j<=n; j+=i) if(in[j]) cur_sum += a[j];
          if(cur_sum < 0) {
            for(int j=i; j<=n; j+=i)
              in[j] = false;
          }
        }
        long sum = 0;
        for(int i=1; i<=n; i++) if(in[i]) sum += a[i];
        out.println(sum);
        // int n = Integer.parseInt(st.nextToken());

        out.close(); System.exit(0);
    }
}
