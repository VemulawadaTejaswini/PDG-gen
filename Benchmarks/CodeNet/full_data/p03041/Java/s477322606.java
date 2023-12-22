import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import static java.lang.Character.toLowerCase;


public class Main {

    // input
    static int n;
    static int k;
    static String s;
    
    /**
     * input
     */
    static void input(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        s = sc.next();
        sc.close();
    }
 
    /**
     * solver
     */
    static void solve(){ 
        String ans = "";
        for (int i=0;i<n;i++) {
            if (i + 1 == k){
                ans += Character.toLowerCase(s.charAt((i)));  
            } else {
                ans += s.charAt(i);
            }
        }
        System.out.println(ans);
    }

    public static void main(String args[]) {

        input();

        solve();
    }
}
