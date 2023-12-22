import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        String s = bf.readLine();
        int n = s.length();
        ArrayList<Integer> pos = new ArrayList<Integer>();
        for(int i=0; i<n-1; i++) {
          if(s.charAt(i)=='R' && s.charAt(i+1)=='L') pos.add(i);
        }
        int[] ans = new int[n];
        for(int i : pos) {
          int cur = i;
          int count = 0;
          while((cur >=0) && (s.charAt(cur) == 'R')) {
            count++;
            if(count%2 == 1) ans[i] ++;
            else ans[i+1]++;

            cur--;

          }
          cur = i+1;
          count = 0;
          while((cur < n) && (s.charAt(cur) == 'L')) {
            count++;
            if(count%2 == 1) ans[i+1] ++;
            else ans[i]++;

            cur++;

          }

        }
        StringBuilder sb = new StringBuilder();
        for(int i : ans) sb.append(i+" ");
        out.println(sb.toString());
        // int n = Integer.parseInt(bf.readLine());
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        // int[] a = new int[n]; for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
        // int n = Integer.parseInt(st.nextToken());

        out.close(); System.exit(0);
    }
}
