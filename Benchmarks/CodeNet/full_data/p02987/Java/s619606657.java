import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();
        if (Judge(S) == 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static int Judge(String S) {
        if (S.length() < 2) {
            return 0;
        }
        int num = 0;
        String remain = "";
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(0) == S.charAt(i)) {
                num = 1;
            }
            else {
                remain += S.charAt(i);
            }
        }
        if (remain.length() != 0) {
            return num + Judge(remain);
        }
        return num;
    }
}
