
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        boolean ans = solve(S);
        System.out.println(ans? "AC" : "WA");
    }

    private static boolean solve(String S) {
        if (!S.startsWith("A")) return false;

        int idx = -1;
        for (int i=2; i<S.length()-1; i++) {
            if (S.charAt(i) == 'C') {
                if (idx != -1) return false;

                idx = i;
            }
        }
        if (idx == -1) return false;

        String conv = S.toLowerCase();
        char[] charS = conv.toCharArray();
        charS[0] = 'A';
        charS[idx] = 'C';
        conv = String.valueOf(charS);

        if (!conv.equals(S)) return false;

        return true;
    }

}
