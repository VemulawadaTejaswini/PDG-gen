
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        if (S.charAt(0) == 'A') {
            System.out.println(judge(S) ? "AC" : "WA");
        } else {
            System.out.println("WA");
        }
    }

    private static boolean judge(String str) {
        for (char c : str.toCharArray()) {
            for (int ct = 'D'; ct <= 'Z'; ct++) {
                if (c == (char) ct) {
                    return false;
                }
            }
            if (c == 'B') {
                return false;
            }

        }
        str = str.substring(2);
        if (str.charAt(str.length() - 1) == 'C') {
            return false;
        } else if (str.contains("C")) {
            str = str.substring(0, str.length() - 1);
            return (str.indexOf("C") == str.lastIndexOf("C"));
        } else {
            return false;
        }
    }
}
