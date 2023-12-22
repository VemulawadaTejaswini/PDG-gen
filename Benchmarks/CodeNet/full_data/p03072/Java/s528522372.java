import java.util.Scanner;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            if (m <= h) {
                ans++;
            }
            m = Math.max(m, h);
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
