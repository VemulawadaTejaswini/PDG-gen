
import java.io.*;
import java.util.*;
//import java.util.stream.*;
//import java.math.*;

public class Main {

    public static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        //forl(n, array, sc);
        int a1, b1;
        int ans = 0;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            a1 = sc.nextInt();
            b1 = sc.nextInt();
            sum += b1;
            if (sum >= k && ans == 0) {
                ans = a1;
            }
        }
        System.out.println(ans);
        bw.flush();
    }

    public static void forl(int n, int[] array, Scanner sc) {
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
    }
}
