import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        int[] ans = new int[n+1];
        int m = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = n; i > 0; i--) {
            int d = n / i;
            int c = a[i];
            for (int j = 2; j <= d; j++) {
                c ^= ans[i*j];
            }
            ans[i] = c;
            if(c == 1){
                m++;
                sb.append(i + " ");
            }
        }
        System.out.println(m);
        if(0 < m){
            System.out.println(sb.toString().trim());
        }
        sc.close();

    }

}
