
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        long[] a = new long[n];
        a[0] = sc.nextLong();
        long ans = 0L;
        for (int i = 1; i < n; i++) {
            a[i] = sc.nextLong();
            if(a[i-1] + a[i] > x){
                long diff =  (a[i-1] + a[i]) - x;
                a[i] -= diff;
                ans += diff;
            }
        }

        System.out.println(ans);
        sc.close();
    }

}
