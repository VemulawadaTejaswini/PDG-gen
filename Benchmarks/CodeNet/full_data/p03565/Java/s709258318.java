import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        if (s.length() < t.length()) {
            System.out.println("UNRESTORABLE");
            return;
        }

        for (int i = s.length() - t.length(); i>=0; i--) {
            String sub = s.substring(i, i+t.length());
            String str = canSame(sub, t);
            if(str != null) {
                StringBuilder sb = new StringBuilder();
                int index = 0;
                while (index < i) {
                    sb.append(s.charAt(index) == '?' ? 'a' : s.charAt(index));
                    index++;
                }
                System.out.println(sb.toString() + str);
                return;
            }
        }

        System.out.println("UNRESTORABLE");
    }

    private static String canSame(String s, String t) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '?' || s.charAt(i) == t.charAt(i)) {
                sb.append(t.charAt(i));
            } else {
                return null;
            }
        }
        return sb.toString();
    }
}