import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // Scanner scan = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] a = new int[n]; for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
        for(int i=0; i<n; i++) a[i] -= (i+1);
        long sum = 0;
        Arrays.sort(a);
        int median = a[n/2];
        long test1 = 0;
        for(int i=0; i<n; i++) {
          test1 += Math.abs(0L + a[i] - median);
        }
        out.println(test1);
        // int n = Integer.parseInt(st.nextToken());
        // int n = scan.nextInt();

        out.close(); System.exit(0);
    }
}
