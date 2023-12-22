import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] num = new int[n];
        Arrays.fill(num, -1);
        for (int i = 0; i < m; i++) {
            int s = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());
            if (s == 1 && c == 0 && n != 1) {
                System.out.println(-1);
                return;
            }
            if (num[s - 1] != -1 && num[s - 1] != c) {
                System.out.println(-1);
                return;
            }
            num[s - 1] = c;
        }
        for (int i = 0; i < n; i++) {
            if (i == 0 && num[i] == -1) {
                num[i] = 1;
            } else if (num[i] == -1) {
                num[i] = 0;
            }
        }
        for (int ans : num) {
            System.out.print(ans);
        }
        System.out.println();
    }
}