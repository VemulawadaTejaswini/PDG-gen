import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    // input
    static int N;
    static String[] s;

    /**
     * input
     */
    static void input(){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        s = new String[N];
        for(int i=0;i<N;i++){
            s[i] = sc.next();
        }
        sc.close();
    }
 
    /**
     * solver
     */
    static void solve(){
        int ans;
        int ab = 0;
        int ba = 0;
        int a=0;
        int b=0;

        for(int i=0;i<N;i++){
            ab += s[i].split("AB", -1).length - 1;
            boolean _b = false;
            boolean _a = false;

            if(s[i].charAt(0) == 'B'){
                _b = true;
            }
            if(s[i].charAt(s[i].length() - 1) == 'A') {
                _a = true;
            }

            if (_a && _b) ba ++;
            if (_a && !_b) a ++;
            if (!_a && _b) b ++;
        }

        if (ba > 0) {
            if (a == b) {
                ans = ab + Math.max(0,ba-1) + Math.min(a,b);
            } else {
                ans = ab + Math.max(0,ba-1) + Math.min(a,b)+1;
            }
        } else {
            ans = ab + Math.min(a,b);
        }

        System.out.println(ans);

    }

    public static void main(String args[]) {

        input();

        solve();
    }
}
