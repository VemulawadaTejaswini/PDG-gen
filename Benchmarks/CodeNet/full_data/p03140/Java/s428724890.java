import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        sc.close();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            switch (que(a.charAt(i), b.charAt(i), c.charAt(i))) {
            case 0:
                ans += 2;
                break;
            case 1:
                ans += 1;
                break;
            }
        }
        System.out.println(ans);
    }

    public static int que(char a, char b, char c) {
        int ans = 0;
        if (a == b) ans++;
        if (c == b) ans++;
        if (a == c) ans++;
        return ans;
    }
}
