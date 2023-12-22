import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int idx = 1;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == idx) {
                idx++;
            }
        }
        int ans;
        if (idx == 1) {
            ans = -1;
        } else {
            ans = n - idx + 1;
        }
        System.out.println(ans);
    }
}