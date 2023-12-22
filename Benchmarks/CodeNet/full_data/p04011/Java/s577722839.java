
import java.io.*;
import java.util.*;
//import java.util.stream.*;;
//import java.math.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        int n, k, x, y;
        int i = 0;
        long sum = 0;
        n = sc.nextInt();
        k = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        while (i++ < n) {
            if (i <= k) {
                sum += x;
            } else {
                sum += y;
            }
        }
        System.out.println(sum);
        bw.flush();
    }
}
