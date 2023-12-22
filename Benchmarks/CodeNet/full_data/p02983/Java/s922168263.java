import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        if (r - l > 2019) {
            System.out.println("0");
            return;
        }
        long res = Integer.MAX_VALUE;
        for (int i = l; i <= r; i++) {
            for (int j = i+1; j <= r; j++) {
                long x = (i*j)%2019;
                if (x < res) {
                    res = x;
                }
            }
        }
        System.out.println(res);
    }

}
/*

 */