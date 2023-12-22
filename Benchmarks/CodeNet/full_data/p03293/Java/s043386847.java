import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    private boolean check(char[] S, char[] T, int si, int sj) {
        int N = S.length;
        for (int i = 0; i < N; i++) {
            if (S[(si + i) % N] !=  T[(sj + i) % N]) {
                return false;
            }
        }
        return true;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();
        char[] T = sc.next().toCharArray();

        boolean rotatable = false;
        for (int i = 0; i < S.length; i++) {
            char ch = S[i];
            // find ch
            for (int j = 0; j < T.length; j++) {
                if (ch == T[j]) {
                    // start check
                    if (check(S, T, i, j)) {
                        System.out.println("Yes");
                        return;
                    }
                }
            }
        }
        
        System.out.println("No");

        return;
    }

}