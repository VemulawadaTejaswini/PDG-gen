import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int L = S.length();

        boolean isPar = isParindorome(S);
        boolean isParLeft = isParindorome(S.substring(0, (L - 1) / 2));
        boolean isParRight = isParindorome(S.substring(((L + 3) / 2)-1, L));
        if (!isPar || !isParLeft || !isParRight) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }

    static Boolean isParindorome(String S) {
        int N = S.length();
        for (int i = 0; i < N / 2; i++) {
            if (S.charAt(i) != S.charAt((N - 1) - i)) {
                return false;
            }
        }
        return true;
    }
}
