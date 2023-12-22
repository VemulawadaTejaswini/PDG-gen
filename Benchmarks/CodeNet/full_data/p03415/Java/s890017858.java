import java.util.*;
public class Main {
    static String getCharString(String string, int index) {
        return String.valueOf(string.charAt(0));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s0 = sc.next(), s1 = sc.next(), s2 = sc.next();
        String ans = getCharString(s0, 0) + getCharString(s1, 1) + getCharString(s2, 2);
        System.out.println(ans);
        sc.close();
    }
}
