import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class A {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(bf.readLine());
        long sq = (long)Math.ceil(Math.sqrt(n));
        long sq1 = sq*sq;
        long diff1 = sq1-n;
        long sq2 = sq*(sq-1);
        long diff2 = sq2 - n;
        if((diff2 >= 0) && (diff2 < diff1)) {
          out.println(sq + " " + diff2 + " " + 1 + " " + (sq-1) + " " + 0 + " " + 0);
        }
        else {
          out.println(sq + " " + diff1 + " " + 1 + " " + (sq) + " " + 0 + " " + 0);
        }

        // StringTokenizer st = new StringTokenizer(bf.readLine());
        // int[] a = new int[n]; for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
        // int n = Integer.parseInt(st.nextToken());

        out.close(); System.exit(0);
    }
}
