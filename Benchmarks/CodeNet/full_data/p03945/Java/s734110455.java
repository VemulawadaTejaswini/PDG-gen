import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String s = sc.next();
        char c = s.charAt(0);
        int ret = 0;
        for (int i = 1;i < s.length();i++) {
            char tmp = s.charAt(i);
            if (c!=tmp) ret++;
            c = tmp;
        }
        System.out.println(ret);
    }
}
