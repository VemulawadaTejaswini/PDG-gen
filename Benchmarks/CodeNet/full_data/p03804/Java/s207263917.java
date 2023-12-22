import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        String[] stA = new String[n];
        String[] stB = new String[m];

        for (int i = 0; i < n; i++) {
            stA[i] = sc.next();
        }

        for (int i = 0; i < m; i++) {
            stB[i] = sc.next();
        }

        String ans = "No";

        loop1: for (int i = 0; i <= n - m; i++) {
            for (int j = 0; j < m; j++) {
                if (!stA[i + j].contains(stB[j])) {
                    break;
                } else {
                    if (j == m - 1) {
                        ans = "Yes";
                        break loop1;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}
