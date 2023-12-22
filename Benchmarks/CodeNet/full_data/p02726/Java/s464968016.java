import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] sums = new int[n];
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int dis = Math.min(j - i, Math.abs(x - i) + 1 + Math.abs(y - j));
                sums[dis]++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < n; i++) {
            sb.append(sums[i]).append("\n");
        }
        System.out.print(sb);
    }
}
