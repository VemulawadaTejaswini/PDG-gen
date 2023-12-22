import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = buildStr(a, b);
        String t = buildStr(b, a);
        String ans = (s.compareTo(t) < 0) ? s : t;
        System.out.println(ans);
    }

    static String buildStr(int a, int b) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < b; ++i) sb.append(a);
        return sb.toString();
    }
}