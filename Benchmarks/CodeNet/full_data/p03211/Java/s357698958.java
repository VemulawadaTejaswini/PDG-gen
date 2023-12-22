import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        String s = sc.next();
        String ans = "";
        int minDiff = Integer.MAX_VALUE;
        int n = 753;
        for (int i = 0; i < s.length() - 2; i++) {
            String tmp = s.substring(i, i + 3);
            int diff = Math.abs(n - Integer.parseInt(tmp));
            if (diff < minDiff) {
                minDiff = diff;
                ans = tmp;
            }
        }
        System.out.println(ans);
    }
}