import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        long K = sc.nextLong();
        sc.close();

        System.out.println(NotContinue(S.charAt(0), S, K));
    }
    public static long NotContinue(char a, String S, long K) {
        if (S.length() < 2) {
            if (S.charAt(0) == a) {
                return K / 2;
            }
            return 0;
        }
        if (S.charAt(0) == S.charAt(1)) {
            if (S.length() >= 3) {
                return K + NotContinue(a, GetDiffString(S.charAt(0), S.charAt(2)) + S.substring(2), K);
            }
            return K + NotContinue(a, GetDiffString(S.charAt(0), a) + S.substring(2), K);
        }
        return NotContinue(a, S.substring(1), K);
    }
    public static String GetDiffString(char a, char b) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphabet.length(); i++) {
            if(a != alphabet.charAt(i) && b != alphabet.charAt(i)) {
                return alphabet.substring(i, i+1);
            }
        }
        return "a";
    }
}

