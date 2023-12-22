import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int count = 1;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int num = a[0];
        for (int i = 1; i < n; i++) {
            if (num == a[i])
                count++;
            else {
                if (num == count)
                    ;
                else
                    ans += Math.min(count, Math.abs(count - num));
                num = a[i];
                count = 1;
            }
        }
        if (num == count)
            ;
        else
            ans += Math.min(count, Math.abs(count - num));
        System.out.println(ans);
    }
}
