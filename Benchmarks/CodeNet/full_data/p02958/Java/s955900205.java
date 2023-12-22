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
       int[] a = new int[n]; for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
       for(int i=0; i<n; i++) {
         for(int j=i; j<n; j++) {
           int temp = a[i];
           a[i] = a[j];
           a[j] = temp;
           boolean sorted = true;
           for(int k=0; k<n; k++) {
             if(a[k] != (k+1)) sorted= false;
           }
           if(sorted) {
             out.println("YES");
             out.close();
             System.exit(0);
           }

           temp = a[i];
           a[i] = a[j];
           a[j] = temp;
         }
       }
       out.println("NO");

        // int n = Integer.parseInt(st.nextToken());

        out.close(); System.exit(0);
    }
}
