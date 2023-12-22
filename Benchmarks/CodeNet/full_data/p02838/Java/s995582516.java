import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[61];
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            for (int j = 0; j <= 60; j++) {
                if((x >> j & 1) == 1){
                    a[j]++;
                }
            }
        }
        long ans = 0L;
        for (int i = 0; i <= 60; i++) {
            ans = (ans + ((long)Math.pow(2, i) * a[i] * (n-a[i]))% 1_000_000_007) % 1_000_000_007;
        }
        System.out.println(ans);
        sc.close();

    }

}
