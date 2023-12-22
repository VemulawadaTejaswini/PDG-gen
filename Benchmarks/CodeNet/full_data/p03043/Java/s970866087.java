import java.math.*;
import java.util.Scanner;

public class Main {

    static final int modnum = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        double ans = 0;

        // int needone = (int) Math.ceil(Math.log(K) / Math.log(2));
        // double perone = Math.pow(0.5, needone);
        // System.out.println(needone + " " + perone);
        // ans += perone;

        for (int i = 1; i <= N; i++) {
            if (i >= K) {
                ans += 1;
                continue;
            }
            int need = (int) Math.ceil(Math.log((double) K / i) / Math.log(2));
            double per = Math.pow(0.5, need);
            // System.out.println(need + " " + per);
            ans += per;
        }
        ans /= N;
        // System.out.println();
        System.out.println(ans);
    }
}