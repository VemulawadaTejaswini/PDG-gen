import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[3];
        a[0] = in.nextInt(); a[1] = in.nextInt(); a[2] = in.nextInt();
        int cnt = a[0]%2 + a[1]%2 + a[2]%2;
        int ans = 0;
        if(cnt == 1 || cnt == 2) {
            ans++;
            for (int i = 0; i < 2; i++) {
                if(a[i]%2== (cnt == 1 ? 0 : 1)) a[i]++;
            }
        }
        Arrays.sort(a);
        ans += (a[2] - a[0]) / 2;
        ans += (a[2] - a[1]) / 2;

        System.out.println(ans);
    }
}
