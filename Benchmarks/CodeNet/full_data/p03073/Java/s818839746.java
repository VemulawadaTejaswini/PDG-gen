import java.util.Scanner;

public class Main {

    int solve(String s, boolean flip) {
        int n = s.length();
        int[] as = new int[n];
        for (int i = 0; i < n; i++) {
            as[i] = s.charAt(i) == '0' ? 0 : 1;
        }
        if (flip) {
            as[0] = as[0] == 0 ? 1 : 0;
        }
        int ans = flip ? 1 : 0;
        for (int i = 1; i < n; i++) {
            if (as[i] == as[i - 1]) {
                as[i] = as[i] == 0 ? 1 : 0;
                ans++;
            }
        }
        return ans;
    }


    void run() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(Math.min(solve(s, false), solve(s, true)));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
