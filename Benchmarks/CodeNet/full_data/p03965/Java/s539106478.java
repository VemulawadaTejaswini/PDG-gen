import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        int g = 0;
        int p = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'g') {
                if (p > 0) {
                    ans += Math.max(g - p - 1, 0);
                    g = 1;
                    p = 0;
                } else {
                    g++;
                }
            } else {
                p++;
            }
        }
        ans += Math.max(g - p - 1, 0);
        System.out.println(ans);
    }

}
