import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by sonetsuyoshi on 2016/07/31.
 */
public class Main {
    static int n;
    static int[] dif;
    static long mod = 1000000007;
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dif = new int[n];

        for(int i = 0; i < n; i++) {
            dif[i] = sc.nextInt();
        }


        if(n % 2 == 0) {
            for(int i = 0; i < n; i++) {
                if(dif[i] % 2 == 0) {
                    System.out.println(0);
                    return;
                }
            }
        }

        if(n % 2 == 1) {
            for(int i = 0; i < n; i++) {
                if(dif[i] % 2 == 1) {
                    System.out.println(0);
                    return;
                }
            }
        }



        int[] box = new int[(n + 1) / 2];
        Arrays.fill(box, 2);
        if(n % 2 == 1) {
            box[0] = 1;
        }
        for(int d: dif) {
            box[d / 2] -= 1;
        }
        for(int b: box) {
            if(b != 0) {
                System.out.println(0);
                return;
            }
        }

        long ans = 1;
        for(int i = 0; i < n / 2; i++) {
            ans *= 2;
            ans %= mod;
        }
        System.out.println(ans);
    }
}