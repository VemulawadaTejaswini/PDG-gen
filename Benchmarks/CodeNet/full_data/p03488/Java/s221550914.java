import java.util.*;

public class Main {
    public void main(Scanner sc) {
        String s[] = sc.next().split("T", -1);
        int x = sc.nextInt();
        int y = sc.nextInt();

        List<Integer> tate = new ArrayList<>();
        List<Integer> yoko = new ArrayList<>();
        for (int i = 1; i < s.length; i++) {
            if (i % 2 == 0) {
                yoko.add(s[i].length());
            } else {
                tate.add(s[i].length());
            }
        }

        boolean dp[][] = new boolean[yoko.size() + 1][16001];
        dp[0][s[0].length() + 8000] = true;
        int i = 0;
        for (Integer dx : yoko) {
            for (int j = 0; j < 16000; j++) {
                if (dp[i][j]) {
                    if (j + dx <= 16000) {
                        dp[i + 1][j + dx] = true;
                    }
                    if (j - dx >= 0) {
                        dp[i + 1][j - dx] = true;
                    }
                }
            }
            i++;
        }
        boolean res1 = dp[yoko.size()][x + 8000];

        dp = new boolean[tate.size() + 1][16001];
        dp[0][8000] = true;
        i = 0;
        for (Integer dy : tate) {
            for (int j = 0; j < 16000; j++) {
                if (dp[i][j]) {
                    if (j + dy <= 16000) {
                        dp[i + 1][j + dy] = true;
                    }
                    if (j - dy >= 0) {
                        dp[i + 1][j - dy] = true;
                    }
                }
            }
            i++;
        }
        boolean res2 = dp[tate.size()][y + 8000];

        System.out.println(res1 & res2 ? "Yes" : "No");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
