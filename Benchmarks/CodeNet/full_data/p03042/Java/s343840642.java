import java.util.*;
import java.util.Scanner;
import java.util.stream.Collectors;
import static java.lang.Character.toLowerCase;


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

        String s1 = s.substring(0,2);
        String s2 = s.substring(2,4);
        String ans = "NA";

        ArrayList<String> mm = new ArrayList<String>(
            Arrays.asList("01","02","03","04","05","06","07","08","09","10","11","12")
        );

        boolean b1 = mm.contains(s1);
        boolean b2 = mm.contains(s2);

        if (b1 && b2) ans = "AMBIGUOUS";
        if (b1 && !b2) ans = "MMYY";
        if ( !b1 && b2) ans = "YYMM";

        System.out.println(ans);
    }

    public static void main(String args[]) {

        input();

        solve();
    }
}
