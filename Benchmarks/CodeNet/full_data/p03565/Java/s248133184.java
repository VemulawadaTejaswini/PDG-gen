import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();

        for (int i = s.length - t.length; i >= 0; i--) {
            if (s[i] != t[0] && s[i] != '?') {
                continue;
            }

            for (int j = 0; j < t.length; j++) {
                if (s[i + j] != t[j] && s[i + j] != '?') {
                    break;
                }

                if (j == t.length - 1) {
                    String prefix = String.valueOf(s).substring(0, i);
                    String sufix = String.valueOf(s).substring(i + t.length);
                    System.out.println((prefix + String.valueOf(t) + sufix).replace('?', 'a'));
                    return;
                }
            }
        }

        System.out.println("UNRESTORABLE");
    }
}