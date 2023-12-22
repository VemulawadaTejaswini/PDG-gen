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

        StringBuilder sb = new StringBuilder();
        for (int start = 0; start + t.length() <= s.length(); start++) {
            if (start > 0) {
                String sub = s.substring(0, start);
                sb.append(sub.replaceAll("\\?", "a"));
            }

            boolean flag = true;
            int p1 = start;
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(p1) == '?' || s.charAt(p1) == t.charAt(j)) {
                    sb.append(t.charAt(j));
                } else if (s.charAt(p1) != t.charAt(j)) {
                    flag = false;
                    break;
                }
                p1++;
            }
            if (flag) {
                System.out.println(sb.toString());
                return;
            } else {
                sb.setLength(0);
            }
        }

        System.out.println("UNRESTORABLE");
    }
}