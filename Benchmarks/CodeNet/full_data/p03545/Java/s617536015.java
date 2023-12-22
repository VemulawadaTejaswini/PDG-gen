import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String abcd = sc.next();
        int n = abcd.length() - 1;
        StringBuilder res = null;
        for (int bit = 0; bit < (1 << n); bit++) {
            res = new StringBuilder();
            char num = abcd.charAt(0);
            res.append(num);
            int ans = num - '0';
            for (int i = 0; i < n; i++) {
                num = abcd.charAt(i + 1);
                if (((bit>> i) & 1 ) == 1) {
                    res.append('+');
                    res.append(num);
                    ans += num - '0';
                } else {
                    res.append('-');
                    res.append(num);
                    ans -= num - '0';
                }
            }
            if (ans == 7) {
                break;
            }
        }
        System.out.println(res.toString() + "=7");
    }
}
