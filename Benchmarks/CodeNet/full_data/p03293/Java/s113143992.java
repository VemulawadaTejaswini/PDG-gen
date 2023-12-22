import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int l = s.length();
        boolean ans = false;
        for (int i = 0; i < l; i++) {
            int count = 0;
            for (int j = 0; j < l; j++) {
                if (i + j < l) {
                    if (s.charAt(j) == t.charAt(j + i)) count++;
                } else {
                    if (s.charAt(j) == t.charAt(j + i - l)) count++;
                }
            }
            if (count == l) ans = true;
        }
        if (ans) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }    
}
