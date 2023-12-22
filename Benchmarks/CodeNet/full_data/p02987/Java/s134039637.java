import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();
        if (Judge(S)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static boolean Judge(String S) {
        if (S.length() < 2) {
            return true;
        }
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(0) == S.charAt(i)) {
                if (i == 1) {
                    return Judge(S.substring(i+1));
                }
                return Judge(S.substring(1,i) + S.substring(i+1));
            }
        }
        return false;
    }
}
