import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static long gcd(long a, long b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(br.readLine());

        long ans = 1;
        for (int i = 0; i < n; i++) {
            long in = Long.parseLong(br.readLine());
            ans = in / gcd(ans, in) * ans;
        }

        System.out.println(ans);
    }
}
