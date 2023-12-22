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
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long n = Long.parseLong(st.nextToken());
        long k = Long.parseLong(st.nextToken());
        br.close();

        long x;
        n -= k * (n / k);
        while (true) {
            x = Math.abs(n-k);
            if (x >= n) {
                break;
            }
            else n = x;
        }
        System.out.println(n);
    }
}
