import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        if (StringPalindrome(S)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    public static boolean StringPalindrome(String S) {
        // 1.Sは回文
        // 2.Sの1～(S.length()-1)/2文字目までが回文
        // 3.Sの(S.length()+3)/2～S.length()文字目までが回文
        StringBuffer sb = new StringBuffer(S);
        StringBuffer sb1 = new StringBuffer(S.substring(0, (S.length()-1)/2));
        if (sb.toString().compareTo(sb.reverse().toString()) == 0) {
            if (sb1.toString().compareTo(sb1.reverse().toString()) == 0) {
                return true;
            }
        }
        return false;
    }
}
