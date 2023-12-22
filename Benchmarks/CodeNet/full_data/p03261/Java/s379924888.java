import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> ls = new ArrayList<>();
        String last = sc.next();
        ls.add(last);
        String now;
        String ans = "Yes";
        for (int i = 0; i < n; i++) {
            now = sc.next();
            if (last.charAt(last.length() - 1) != now.charAt(0)) {
                ans = "No";
                break;
            }
            ls.add(now);
            if (ls.indexOf(now) != -1) {
                ans = "No";
                break;
            }
            last = now;
        }
        System.out.println(ans);
    }
}
