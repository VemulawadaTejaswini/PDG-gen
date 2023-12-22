
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            // main
        Scanner sc = new Scanner(System.in);
        int N = nextInt(sc);
        int K = nextInt(sc);
        String S = getLine(sc);

        show(calc(N, K, S));

    }

    private static String calc(int N, int K, String S) {
        StringBuilder str;
        str = new StringBuilder();

        char[] charArray = S.toCharArray();
        for (int i = 0; i < N; i++) {
            char c = charArray[i];

            if (i + 1 == K) c = toLower(c);

            str.append(c);

        }
        return str.toString();
    }

    private static String getLine(Scanner sc) { return sc.next(); }
    private static int nextInt(Scanner sc) { return Integer.parseInt(sc.next()); }
    private static void show(String answer) {
        System.out.println(answer);
    }
    private static char toLower(char c) { return (char)(c + 32); }
}