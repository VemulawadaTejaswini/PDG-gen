import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] grid = new int[n];
        for (int i = 0; i < n; i++) {
            grid[i] = sc.nextInt();
        }
        int num = n - 1;
        int max = 0;
        for (int i = num; i >= 0; i--) {
            int cnt= 0;
            if (i - 1 > 0) {
                for (int j = n - 1; j >= 0; j--) {
                    if (i == j) continue;
                    if (j - 1 > 0) {
                         if (grid[j] <= grid[j - 1]) {
                            cnt++;
                        } else {
                            break;
                        }
                    }
                }
            }
            max = Math.max(max, cnt);
        }
        System.out.println(max);
    }
}
