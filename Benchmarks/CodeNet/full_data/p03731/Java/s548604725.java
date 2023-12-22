import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long t = Long.parseLong(sc.next());
        long ans = 0;
        for (int i = 0; i < n; i++) {
            long temp = Long.parseLong(sc.next());
            if (i == 0) {
                ans += t;
            } else {
                if (ans - t + temp + temp > t) {
                    if (t - temp > 0) {
                        ans -= t - temp;
                    }
                    ans += t;
                }
            }
        }
        System.out.println(ans);
    }
}