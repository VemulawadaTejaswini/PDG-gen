
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean ok = true;
        if (s.charAt(0) != 'A')
            ok = false;
        boolean check = false;
        int idx = 0;
        for (int i = 2; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'C') {
                check = true;
                idx = i;
                break;
            }
        }
        ok &= check;
        for (int i = 1; i < s.length(); i++) {
            if (i == idx)
                continue;
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                ok = false;
        }
        System.out.println(ok ? "AC" : "WA");

    }

}
