import java.util.*;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int index = 0;
        int a = 0;
        int bc = 0;
        int abc = 0;
        int ans = 0;
        while (index < s.length()) {
            if (index + 2 < s.length() && s.charAt(index) == 'A' && s.charAt(index + 1) == 'B' && s.charAt(index + 2) == 'C') {
                abc++;
                index += 3;
            } else if (s.charAt(index) == 'B') {
                a++;
                index++;
            } else if (index + 1 < s.length() && s.charAt(index) == 'B' && s.charAt(index + 1) == 'C') {
                bc++;
                index += 2;
            } else {
                if (abc > 0) {
                    ans += bc;
                    ans += a;
                }
                ans += abc * (abc + 1) / 2;
                abc = 0;
                a = 0;
                bc = 0;
                index++;
            }

        }
        if (abc > 0) {
            ans += bc;
            ans += a;
        }
        ans += abc * (abc + 1) / 2;
        abc = 0;
        a = 0;
        bc = 0;
        index++;
        System.out.println(ans);
    }
}