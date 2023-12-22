import java.io.*;
import java.util.*;
import java.util.stream.*;

/**
 * Created by Ayushi on 15/09/2019.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = r.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);
        long[] a = new long[n];
        temp = r.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(temp[i]);
        }
        r.close();

        for (int j = 0; j < m; j++) {
            Arrays.sort(a);
            a[n-1] = a[n-1]/2;
        }

        long sum = LongStream.of(a).sum();
        System.out.println(sum);
    }
}
