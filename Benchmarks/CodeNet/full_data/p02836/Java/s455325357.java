import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        System.out.println(philia(S));
    }
    public static int philia(String S) {
        switch (S.length()) {
        case 0:
        case 1:
            return 0;
        default:
            if (S.charAt(0) == S.charAt(S.length()-1)) {
                return philia(S.substring(1, S.length()-1));
            }
            return 1 + philia(S.substring(1, S.length()-1));
        } 
    }
}
