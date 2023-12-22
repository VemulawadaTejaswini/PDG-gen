import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        String s = scanner.next();
        int ans = 0;
        boolean h = false;
        for (char c : s.toCharArray()) {
            if (h && c == 'g')
                ans++;
            else if (!h && c == 'p')
                ans--;
            h = !h;
        }
        System.out.println(ans);
    }
}