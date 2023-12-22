import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import static java.lang.Character.toLowerCase;


public class Main {

    // input
    static int n;
    static int k;
    
    /**
     * input
     */
    static void input(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        sc.close();
    }
 
    /**
     * solver
     */
    static void solve(){
        double ans = 0;
        int cMax = 0;

        for (int i =1;i<=n;i++) {
            int c = 0;  // # of coin toss requred. p = (1/2)^n
            int j = i;
            while (j < k) {
                j *= 2;
                c ++;
            }
            if (i == 1) cMax = c;
            ans += Math.pow(2, cMax - c);
        }

        ans *= 1.0 / n / Math.pow(2, cMax);

        System.out.println(ans);
    }

    public static void main(String args[]) {

        input();

        solve();
    }
}
