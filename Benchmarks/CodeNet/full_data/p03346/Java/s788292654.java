import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt()-1;
            q[p[i]] = i;
        }
        int ans = 0;
        int tmp = 1;
        for (int i = 1; i < n; i++) {
            if(q[i-1] < q[i]) tmp++;
            else{
                if(ans < tmp) ans = tmp;
                tmp = 1;
            }
        }
        if(ans < tmp) ans = tmp;
        System.out.println(n-ans);
        sc.close();

    }

}
