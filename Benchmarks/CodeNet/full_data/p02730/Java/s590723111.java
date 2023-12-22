import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int L = S.length();

        boolean isPar = isParindorome(S);
        boolean isParLeft = isParindorome(S.substring(0, L / 2));
        boolean isParRight = isParindorome(S.substring(L / 2 + 2, L - 1));
        if (!isPar || !isParLeft || !isParRight) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }

    static Boolean isParindorome(String S) {
        int N = S.length();
        for (int i = 0; i < N / 2; i++) {
            if (S.charAt(i) != S.charAt(N - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
