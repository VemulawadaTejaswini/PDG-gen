import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i =0;i<n; i++) {
            p[i] = sc.nextInt();
        }
        int ans = 0;

        for (int i = 0;i < n; i ++) {
                  boolean flag = true;
            int tmp = p[i];
            for (int j = 0;j < i; j ++) {
                if (tmp > p[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) ans++;
        }

        System.out.println(ans);

    }
}
