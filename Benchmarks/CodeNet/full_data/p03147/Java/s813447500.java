import java.time.Year;
import java.util.*;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    // input
    static int n;
    static ArrayList<Integer> h;

    /**
     * input
     */
    static void input(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        h = new ArrayList<Integer>();

        for(int i=0;i<n;i++){
            h.add(sc.nextInt());
        }
        sc.close();
    }
 
    // global
    static int ans;

    static void rec(){
        int m = Collections.max(h);

        if (m == 0) {
            return;
        } else {
            int prev = -1;
            for(int i=0;i<n;i++){
                if (h.get(i) == m) {
                    if (prev != m) {
                        ans ++;
                    }
                    h.set(i, h.get(i) - 1);
                    prev = m;
                } else {
                    prev = h.get(i);
                }
            }
            rec();
        }

    }

    /**
     * solver
     */
    static void solve(){
        rec();
        System.out.println(ans);
    }


    public static void main(String args[]) {

        input();

        solve();
    }
}
