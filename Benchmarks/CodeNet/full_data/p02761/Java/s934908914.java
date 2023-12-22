import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        Arrays.fill(a, -1);
        boolean ans = true;
        for (int i = 0; i < m; i++) {
            int s = sc.nextInt()-1;
            int c = sc.nextInt();
            if(a[s] < 0) a[s] = c;
            else if(a[s] != c) {
                ans = false; break;
            }
        }
        if(1 < n && a[0] == 0)ans = false;
        if(n == 2 && a[0]<0 && a[1]==0) ans = false;
        if(ans){
            int b = 0;
            for (int i = 0; i < n; i++) {
                int t = a[i]<0 ? 0:a[i];
                b += Math.pow(10, n-1-i) * t;
            }
            System.out.println(b);
        }else
        System.out.println(-1);
        sc.close();

    }

}
