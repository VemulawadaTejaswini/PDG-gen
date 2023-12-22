import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int l = s.length();
        int count = 0;
        for (int i = 0; i < l; i++) {
            if (t.charAt(i) == s.charAt(l - i - 1) || t.charAt(i) == s.charAt(i)) {
                count++;
            }
        }
        if (count == l) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }    
}
