import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        long ans = 0L;
        long x = a[0], y = a[0];
        for (int i = 1; i < n; i++) {
            int idx = 0;
            if(i % 2 != 0){
                idx = n - 1 - (i/2);
            }else{
                idx = i/2;
            }
            long dx = Math.abs(x - a[idx]);
            long dy = Math.abs(y - a[idx]);
            if(dx < dy){
                ans += dy;
                y = a[idx];
            }else{
                ans += dx;
                x = a[idx];
            }
        }
        System.out.println(ans);
        sc.close();

    }

}
