import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int l = s.length();
        boolean ans = true;
        for (int i = 0; i < l; i++) {
            if (s.charAt(i) != t.charAt(l - i - 1)) ans = false;
        }
        if (ans || s.equals(t)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }    
}
