import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rates[] = new int[8];
        int ored = 0;
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            if (tmp >= 3200) {
                ored++;
                continue;
            }
            rates[(int) tmp / 400] = tmp;
        }
        int ans = 0;
        for (int i = 0; i < 8; i++) {
            if (rates[i] != 0)
                ans++;
        }
        System.out.print(ans + " ");
        if (ored > 0)
            ans += ored;
        System.out.println(ans);
    }
}