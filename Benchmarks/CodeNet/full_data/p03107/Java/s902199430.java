import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        List<Character> ch = new ArrayList<>();
        for (int i = 0; i < str.length(); i++)
            ch.add(str.charAt(i));
        int ans = 0;
        for (int i = ch.size() - 1; i > 0; i--) {
            if (ch.get(i) == ch.get(i - 1)) {
                ans += 2;
                System.out.println(i);
                ch.remove(i);
                ch.remove(i - 1);
                i = ch.size() - 1;
            }
        }
        System.out.println(ans+2);
    }
}
