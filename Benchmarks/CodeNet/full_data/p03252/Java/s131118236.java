import java.util.*;

public class Main {
    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        String T = scan.next();
        int l = S.length();
        String ans = "Yes";
        int a, b;

        for (int i = 0; i < l && ans == "Yes"; i++) {
            if (S.charAt(i) == T.charAt(i)) {
                a = T.indexOf(S.charAt(i));
                while (a != -1) {
                    if (a != i && S.charAt(a) != T.charAt(i)) {
                        ans = "No";
                        break;
                    }
                    b = a + 1;
                    a = T.indexOf(S.charAt(i), b);
                }
            }
        }

        System.out.println(ans);
        
        scan.close();
    }
}