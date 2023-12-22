import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        double ans = 0;
        for (int i = 1; i <= n; i++) {
            int m = 1;
            int nn = i;
            while(nn < k) {
                nn *= 2;
                m *= 2;
            }
            ans += 1.0 / m;
        }

        ans /= n;
        System.out.println(ans);
    }
}