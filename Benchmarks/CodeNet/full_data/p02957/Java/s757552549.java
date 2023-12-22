import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        int ans = -1;
        for (int i = 0; i < Math.max(a, b); i++) {
            if (Math.abs(a - i) == Math.abs(b - i)) {
                ans = i;
                break;
            }
        }

        System.out.println(ans < 0 ? "IMPOSSIBLE" : ans);
    }
}