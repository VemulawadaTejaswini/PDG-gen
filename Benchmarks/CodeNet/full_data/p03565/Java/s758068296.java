import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] sdash = sc.next().toCharArray();
        char[] T = sc.next().toCharArray();

        for (int i = 0; i < sdash.length - T.length + 1; i++) {
            boolean isMatch = true;

            for (int j = 0; j < T.length; j++) {
                char sChar = sdash[i + j];
                if (sChar != '?' && sChar != T[j]) {
                    isMatch = false;
                }
            }

            if (isMatch) {
                for (int j = i; j < i + T.length; j++) {
                    sdash[j] = T[j - i];
                }
                for (int j = 0; j < sdash.length; j++) {
                    if (sdash[j] == '?') {
                        sdash[j] = 'a';
                    }
                }
                System.out.println(sdash);
                return;
            }
        }

        System.out.println("UNRESTORABLE");
    }
}