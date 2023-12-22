import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] words = new String[N];
        for (int i = 0; i < N; i++) {
            words[i] = sc.next();
        }
        long c1 = Arrays.stream(words).filter(s -> s.startsWith("B") && s.endsWith("A")).count();
        long c2 = Arrays.stream(words).filter(s -> s.startsWith("B") && !s.endsWith("A")).count();
        long c3 = Arrays.stream(words).filter(s -> !s.startsWith("B") && s.endsWith("A")).count();
        long containsAB = cotntains(words);

        long min = Math.min(c3 + c1, c2 + c1);

        if (c3 + c2 == 0 && c1 > 0) {
            System.out.println(containsAB + c1 - 1);
        } else {
            System.out.println(containsAB + min);
        }
    }

    private static long cotntains(String[] words) {
        long cnt = 0;
        for (String string : words) {
            int size = string.length();
            for (int i = 0; i < size; i++) {
                if (string.charAt(i) == 'A' & i + 1 < size && string.charAt(i + 1) == 'B') {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
