import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        String s = bf.readLine();
        String t = bf.readLine();
        ArrayList<TreeSet<Integer>> pos = new ArrayList<TreeSet<Integer>>();
        for(int i=0; i<26; i++) pos.add(new TreeSet<Integer>());
        for(int i=0; i<s.length(); i++) {
          pos.get(s.charAt(i)-'a').add(i);
        }
        int cur = -1;
        int fullcycles = 0;
        for(int i=0; i<t.length(); i++) {
          TreeSet<Integer> ts = pos.get(t.charAt(i)-'a');
          if(ts.size() == 0) {
            out.println("-1");
            out.close();
            System.exit(0);
          }
          if(ts.last() <= cur) {
            fullcycles++;
            cur = ts.first();
          }
          else cur = ts.higher(cur);
        }
        long ans = 0L + cur + 1L*fullcycles*s.length()+1;
        out.println(ans);
        // int n = Integer.parseInt(bf.readLine());
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        // int[] a = new int[n]; for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
        // int n = Integer.parseInt(st.nextToken());

        out.close(); System.exit(0);
    }
}
