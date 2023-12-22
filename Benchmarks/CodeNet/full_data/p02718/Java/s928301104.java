import java.io.*;
import java.util.*;

/**
 * Created by Ayushi on 04 Apr 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        float[] a = new float[n];
        int j = 0;
        float tot = 0;
        while (st.hasMoreTokens()) {
            a[j] = Float.parseFloat(st.nextToken());
            tot += a[j];
            j++;
        }
        br.close();

        Arrays.sort(a);
        float o = tot/(4*m);
        if (a[n-m] <= o) System.out.println("No");
        else System.out.println("Yes");
    }
}
