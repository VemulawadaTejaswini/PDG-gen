import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] hs = new int[n + 2];
        hs[0] = hs[n + 1] = 0;
        for (int i = 1; i <= n; i++) {
            hs[i] = sc.nextInt();
        }

        boolean f = true;
        int ans = 0;
        while (f) {
            f = false;
            for (int i = 0; i <= n; i++) {
                if (hs[i] == 0) {
                    if (hs[i + 1] > 0) {
                        ans++;
                    }
                    continue;
                } 
                
                hs[i]--;
                f = true;
            }
        }
        System.out.println(ans);
    }
}
