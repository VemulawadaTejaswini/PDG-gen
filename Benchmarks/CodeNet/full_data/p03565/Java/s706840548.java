import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length() + 1; i++) {
            sb.append("z");
        }
        String ans = sb.toString();
        for(int i = 0; i <= s.length() - t.length(); i++) {
            String subStr = s.substring(i, i+t.length());
            String candidate = (s.substring(0, i) + t + s.substring(i + t.length(), s.length())).replaceAll("\\?", "a");
            if (check(subStr, t) && isUpperDictOrder(ans, candidate)) {
                ans = candidate;
            }
        }
        if(ans.length() == s.length() + 1) {
            System.out.println("UNRESTORABLE");
        } else {
            System.out.println(ans);
        }
    }
    private static boolean check(String subStr, String t) {
        int index = 0;
        while (index < t.length()) {
            if (subStr.charAt(index) != '?' && subStr.charAt(index) != t.charAt(index)) return false;
            index++;
        }
        return true;
    }
    private static boolean isUpperDictOrder(String ans, String candidate) {
        int index = 0;
        while(index < ans.length()) {
            if(ans.charAt(index) > candidate.charAt(index)) return true;
            index++;
        }
        return false;
    }
}

