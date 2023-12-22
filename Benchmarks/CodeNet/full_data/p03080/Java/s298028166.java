import java.util.Scanner;

class Problem {
    private int N;
    private String S;

    Problem() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = sc.next();
    }

    String solve() {
        int r = 0;
        int b = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'R') {
                r++;
            } else {
                b++;
            }
        }
        return r > b ? "Yes" : "No";
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Problem().solve());
    }
}
