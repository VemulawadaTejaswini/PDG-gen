import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextLong();
        int cnt = 0;
        int i = 0;
        while (i < s.length() - 1) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                cnt++;
                i++;
            }
            i++;
        }
        boolean con = false;
        if (i == s.length() - 1 && s.charAt(0) == s.charAt(s.length() - 1) && s.charAt(0) != s.charAt(1)) {
            con = true;
        }
        long ans = k * cnt;
        if (con) {
            ans += k - 1;
        }
        System.out.println(ans);
    }
}

