import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        long l = Long.parseLong(st.nextToken());
        long r = Long.parseLong(st.nextToken());
        if (r - l > 2019) {
            System.out.println("0");
            return;
        }
        long res = Integer.MAX_VALUE;
        for (long i = l; i <= r; i++) {
            for (long j = l; j <= r; j++) {
                if (i != j) {
                    long x = (i * j) % 2019;
                    if (x < res) {
                        res = x;
                    }
                }
            }
        }
        System.out.println(res);
    }

}
/*

 */