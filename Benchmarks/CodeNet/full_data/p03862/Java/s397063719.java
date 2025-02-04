import java.util.*;

/**
 * Created by Seiya on 2016/10/16.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int x = scanner.nextInt();
        int[] a = new int[100000];
        long ans = 0;

        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
            if(a[i] > x){
                ans += a[i] - x;
                a[i] = x;
            }
        }

        for (int i = 0; i < N - 1; i++) {
            int temp = a[i] + a[i + 1];
            if(temp > x){
                int sa = temp - x;
                ans += sa;
                a[i + 1] = a[i + 1]  - sa;
            }

        }
        System.out.println(ans);

    }
}


