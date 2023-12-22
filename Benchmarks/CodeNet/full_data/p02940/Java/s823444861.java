import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        String s = bf.readLine();
        int b = 0;
        int r = 0;
        int g = 0;
        int br = 0;
        int rg = 0;
        int gb = 0;
        long ans = 1;
        long mod = 998244353;
        for(int i=1; i<=n; i++) {
          ans *= i;
          ans %= mod;
        }

        for(int i=0; i<3*n; i++) {
          char c = s.charAt(i);
          if(c == 'B') {
            if(rg != 0) {
              ans *= rg;
              rg--;
            }
            else if(r!= 0) {
              ans *= r;
              r--;
              br++;
            }
            else if(g!= 0) {
              ans *= g;
              g--;
              gb++;
            }
            else b++;
          }
          if(c == 'G') {
            if(br != 0) {
              ans *= br;
              br--;
            }
            else if(r!= 0) {
              ans *= r;
              r--;
              rg++;
            }
            else if(b!= 0) {
              ans *= b;
              b--;
              gb++;
            }
            else g++;
          }
          if(c == 'R') {
            if(gb != 0) {
              ans *= gb;
              gb--;
            }
            else if(b!= 0) {
              ans *= b;
              b--;
              br++;
            }
            else if(g!= 0) {
              ans *= g;
              g--;
              rg++;
            }
            else r++;
          }
          ans %= mod;
        }
        out.println(ans);
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        // int[] a = new int[n]; for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
        // int n = Integer.parseInt(st.nextToken());

        out.close(); System.exit(0);
    }
}
