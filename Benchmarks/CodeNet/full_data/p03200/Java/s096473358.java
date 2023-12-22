import java.util.*;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        while (s != s.replaceFirst("BW", "WB")) {
            s = s.replaceFirst("BW", "WB");
            ans++;
        }
        System.out.println(ans);
    }
}
