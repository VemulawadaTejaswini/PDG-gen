import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    // input
    static String s;

    /**
     * input
     */
    static void input(){
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        sc.close();
    }
 
    /**
     * solver
     */
    static void solve(){
        int ans = 0;

        int n = s.length();

        // minimum cost to convert substring s(0:i) -> ...0101
        int[] a = new int[n];

        // minimum cost to convert substring s(0:i) -> ...1010
        int[] b = new int[n];

        // init
        if (s.charAt(0) == '0'){
            a[0] = 1;
            b[0] = 0;
        } else {
            a[0] = 0;
            b[0] = 1;
        }

        // recursion
        for(int i=1;i<n;i++){
            if (s.charAt(i) == '0') {
                a[i] = 1 + b[i-1];
                b[i] = a[i-1];
            } else {
                a[i] = b[i-1];
                b[i] = 1 + a[i-1];
            }
        }

        ans = Math.min(a[n-1], b[n-1]);

        System.out.println(ans);
    }

    public static void main(String args[]) {

        input();

        solve();
    }
}
