import java.util.*;

public class Main {
    public static void main(String args[]) {
        FastScanner cin = new FastScanner();
        String s = cin.next();
        StringBuilder p = new StringBuilder(s);
        int cntP = 0;

        for (int i = 0, j = 0; i < s.length(); ++i) {
            if (p.charAt(i) == 'p')
                ++cntP;
        }

        System.out.println(s.length() / 2 - cntP);
    }

    static class FastScanner {
        StringTokenizer tokenizer;
        Scanner scanner;

        FastScanner() {
            tokenizer = null;
            scanner = new Scanner(System.in);
        }

        int nextInt() {
            while (tokenizer == null || !tokenizer.hasMoreTokens())
                tokenizer = new StringTokenizer(scanner.nextLine());

            return Integer.parseInt(tokenizer.nextToken());
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens())
                tokenizer = new StringTokenizer(scanner.nextLine());

            return tokenizer.nextToken();
        }
    }
}

