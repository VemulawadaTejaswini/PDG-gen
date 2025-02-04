import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int ans = 0;

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            ans += Math.min(x*2, (k - x)*2);
        }

        System.out.println(ans);
    }
}
