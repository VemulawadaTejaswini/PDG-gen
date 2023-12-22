import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        if(TapDance(0, S)){
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
    public static boolean TapDance(int index, String S) {
        if (index >= S.length()) {
            return false;
        }
        if ((index + 1) % 2 == 1) { // odd
            if (S.charAt(index) == 'R' ||
                S.charAt(index) == 'U' ||
                S.charAt(index) == 'D' ) {
                return TapDance(index + 1, S);
            }
            return true;
        } else {    // even
            if (S.charAt(index) == 'L' ||
                S.charAt(index) == 'U' ||
                S.charAt(index) == 'D' ) {
                return TapDance(index + 1, S);
            }
            return true;
        }
    }
}
