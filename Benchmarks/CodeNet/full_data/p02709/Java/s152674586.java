import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        long[][] arr = new long[n + 1][2];
        for(int i = 1; i <= n; i++) {
            arr[i][0] = Long.parseLong(sc.next());
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a, b) -> Long.compare(a[0], b[0]));

        int st = 1;
        int lt = n;
        for(int i = n; i >= 1; i--) {
            int aidx = (int)arr[i][1];
            int idx = Math.abs(aidx - st) < Math.abs(aidx - lt) ? lt : st;
            ans += Math.abs(aidx - idx) * arr[i][0];
            if(idx == st) st++;
            else lt--;
        }
        System.out.println(ans);
    }
}
