import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int T = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            int t = sc.nextInt();
            if (T >= t) {
                ans = c;
            }
        }
        System.out.println(ans);
    }
}