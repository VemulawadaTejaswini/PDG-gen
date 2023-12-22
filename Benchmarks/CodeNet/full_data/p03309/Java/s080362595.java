    import java.util.*;
     
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[n];
            int m = 0;
            long ans = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                a[i] -= i + 1;
            }
            Arrays.sort(a);
            if (a.length % 2 == 1)
                m = a[n / 2];
            else
                m = (a[n / 2] + a[n / 2 - 1]) / 2;
            for (int i = 0; i < n; i++) {
                ans += Math.abs(a[i] - m);
            }
            System.out.println(ans);
        }
    }