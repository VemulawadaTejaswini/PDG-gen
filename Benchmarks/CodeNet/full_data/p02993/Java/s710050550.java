import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();
        if (InputBad(S)) {
            System.out.println("Bad");
        } else {
            System.out.println("Good");
        }
    }
    public static boolean InputBad(String S) {
        if (S.length() < 2) {
            return false;
        }
        if (S.charAt(0) == S.charAt(1)) {
            return true;
        }
        return InputBad(S.substring(1));
    }
}
