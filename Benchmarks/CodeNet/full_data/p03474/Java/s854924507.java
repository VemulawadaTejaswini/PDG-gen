import java.util.*;

public class Main {

    public static String isGood(int A, int B, String S) {
        if (S.length() != A + B + 1) {
            return "No";
        } else {
            for (int i = 0; i < A + B + 1; i++) {
                if (i == A) {
                    if (S.charAt(i) != '-') {
                        return "No";
                    }
                } else {
                    if (!('0' <= S.charAt(i) && S.charAt(i) <= '9')) {
                        return "No";
                    }
                }
            }
            return "Yes";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String S = sc.next();
        System.out.println(isGood(A, B, S));
    }

}
