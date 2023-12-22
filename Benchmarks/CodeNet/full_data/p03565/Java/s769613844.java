import java.util.*;

public class Main{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();
        String t = sc.next();

        if(s.length() < t.length()){
            System.out.println("UNRESTORABLE");
            return;
        }

        for(int head = s.length() - t.length(); head >= 0; --head){
            if(isEqualOrLike(s.substring(head, head + t.length()), t)){
                System.out.println(buildAns(head, s, t));
                return;
            }
        }

        System.out.println("UNRESTORABLE");        
    }

    static boolean isEqualOrLike(String s, String t){
        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); ++i){
            char cs = s.charAt(i);
            if(cs == '?') continue;

            char ct = t.charAt(i);
            if(cs != ct) return false;
        }
        return true;
    }

    static String buildAns(int head, String s, String t){
        StringBuilder sb = new StringBuilder(s.length());
        for(int i = 0; i < s.length(); ++i){
            if(head <= i && i < head + t.length()) sb.append(t.charAt(i - head));
            else sb.append((s.charAt(i) == '?') ? 'a' : s.charAt(i));
        }
        return sb.toString();
    }
}