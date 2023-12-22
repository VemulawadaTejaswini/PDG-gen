import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int A = in.nextInt();
            int B = in.nextInt();
            int C = in.nextInt();
            int D = in.nextInt();
            String S = in.next();
            boolean canSwap = false;
            for (int i = B; i < S.length(); i++) {
                if (i - 1 < 0 || i + 1 >= S.length()) {
                    continue;
                }
                if (S.charAt(i) == '#') {
                    continue;
                }
                if (S.charAt(i - 1) == '.' && S.charAt(i + 1) == '.') {
                    canSwap = true;
                }
            }
            boolean canGoal = true;
            for (int i = A + 1; i < S.length(); i++) {
                if (i - 1 < 0) {
                    continue;
                }
                if (S.charAt(i - 1) == '#' && S.charAt(i) == '#') {
                    canGoal = false;
                }
            }
            System.out.println(!canGoal ? "No" : C < D ? "Yes" : canSwap ? "Yes" : "No");
        }
    }
}
