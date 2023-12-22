import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        // int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        // int[] a = new int[n]; for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());
        int[] a = new int[n]; for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());

        int invcount = 0;
        for(int i=0; i<n; i++)  {
          for(int j=0; j<n-1; j++) {
            if(a[j] > a[j+1]) {
              int temp = a[j];
              a[j] = a[j+1];
              a[j+1] = temp;
              invcount++;
            }
          }
        }
        int val = n*n;
        int count = 1;
        for(int i=1; i<n; i++) {
          if(a[i] == a[i-1]) count++;
          else {
            val -= count*count;
            count=1;
          }
        }
        val -= count*count;
        val /= 2;
        int mod = 1000000007;
        long ans = 1L*k*invcount + (1L*k*(k-1)/2 % mod)* val;
        ans %= mod;
        out.println(ans);
        out.close(); System.exit(0);
    }
}
