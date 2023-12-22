import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt = 0;
        for (char c : s.toCharArray()) {
            if (c == '1')cnt++;
        }
        System.out.println(cnt);
    }
}
