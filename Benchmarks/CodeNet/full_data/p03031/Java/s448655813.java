
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int m = Integer.parseInt(scan.next());

        int[][] s = new int[m][];
        for (int i = 0; i < m; i++) {
            int k = Integer.parseInt(scan.next());
            s[i] = new int[k];
            for (int j = 0; j < k; j++) {
                s[i][j] = Integer.parseInt(scan.next());
                s[i][j]--;
            }
        }

        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = Integer.parseInt(scan.next());
        }
        scan.close();

        int ans = 0;
        for (int bit = 0; bit < (1 << n); bit++) {
            Set<Integer> onSet = new HashSet<Integer>();
            for (int i = 0; i < n; i++) {
                if ((bit & (1 << i)) != 0) {
                    onSet.add(i);
                }
            }

            boolean isSatisfy = true;
            for (int i = 0; i < m; i++) {
                int onCount = 0;
                for (int j = 0; j < s[i].length; j++) {
                    if (onSet.contains(s[i][j])) {
                        onCount++;
                    }
                }
                if (onCount % 2 != p[i]) {
                    isSatisfy = false;
                    break;
                }
            }
            if (isSatisfy) {
                ans++;
            }
        }

        System.out.println(ans);
    }

}
