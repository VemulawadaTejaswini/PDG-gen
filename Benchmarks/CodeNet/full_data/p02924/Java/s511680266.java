import java.io.*;
import java.util.*;
import static java.lang.System.in;

public class Main {
    PrintWriter out = new PrintWriter(System.out);
    // no self-loop or multiple edges
    public static void main(String[] args) throws Exception {
        Main main = new Main();
//        main.solve();
        System.out.println(main.solve());
    }
    long solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        for(int i=1;i<=n;i++){
            ans += i-1;
        }
        return ans;
    }
}

