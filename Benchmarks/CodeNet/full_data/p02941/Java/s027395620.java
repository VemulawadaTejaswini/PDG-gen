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
        int[] b = new int[n]; for(int i=0; i<n; i++) b[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());
        int[] a = new int[n]; for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
        boolean continueloop = true;
        int ans = 0;
        boolean[] diff = new boolean[n];
        for(int i=0; i<n; i++) diff[i] = (a[i]!=b[i]);
        while(continueloop) {
          continueloop = false;
          for(int i=1; i<=n; i++) {
            if(diff[i%n] && (a[i%n] >= a[i-1] + a[(i+1)%n])) {
              if((a[i%n] - b[i%n]) % (a[i-1] + a[(i+1)%n]) == 0) {
                ans += (a[i%n] - b[i%n])/(a[i-1] + a[(i+1)%n]);
                a[i%n] = b[i%n];
                diff[i%n] = false;
                continueloop = true;
                continue;
              }
              ans += 1;//(a[i%n]/(a[i-1] + a[(i+1)%n]));
              a[i%n] -= a[i-1] + a[(i+1)%n];
              diff[i%n] = (a[i%n]!=b[i%n]);
              continueloop = true;

              //continueloop = true;
            }
          }
        }
        for(int i=0; i<n; i++) {
          if(a[i] != b[i]) {
            out.println("-1");
            out.close();
            System.exit(0);
          }
        }
        out.println(ans);
        // int n = Integer.parseInt(st.nextToken());

        out.close(); System.exit(0);
    }
}
