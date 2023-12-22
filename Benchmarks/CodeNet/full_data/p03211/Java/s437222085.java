import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int ans = 1000;
        for (int i = 0; i <= s.length() - 3; i++) {
            ans = Math.abs(Integer.valueOf(s.substring(i, i + 3)) - 753) < ans
                    ? Math.abs(Integer.valueOf(s.substring(i, i + 3)) - 753)
                    : ans;
        }
        System.out.println(ans);
    }
}