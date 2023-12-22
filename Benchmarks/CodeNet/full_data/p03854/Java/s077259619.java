import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        while(S.length() >= 5) {
            int length = S.length();
            if(S.endsWith("dream") || S.endsWith("erase")) {
                S = S.substring(S.length() - 5, S.length());
                if(length == S.length()) {
                    S = "";
                    break;
                }
                continue;
            }
            if(S.endsWith("eraser")) {
                S = S.substring(S.length() - 6, S.length());
                if(length == S.length()) {
                    S = "";
                    break;
                }
                continue;
            }
            if(S.endsWith("dreamer")) {
                S = S.substring(S.length() - 7, S.length());
                if(length == S.length()) {
                    S = "";
                    break;
                }
                continue;
            }
            break;
        }
        if(S.length() == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

