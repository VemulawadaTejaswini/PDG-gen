import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int tmp = sc.nextInt();
        int preA = sc.nextInt();
        int slope = Integer.signum(preA - tmp);
        int ans = 1;
        for (int i = 2; i < n; i++) {
            int a = sc.nextInt();
            int tmpSlope = Integer.signum(a - preA);
            if (slope * tmpSlope < 0) {
                ans++;
            }
            
            slope = tmpSlope;
            preA = a;
        }
        System.out.println(ans);
    }
}
