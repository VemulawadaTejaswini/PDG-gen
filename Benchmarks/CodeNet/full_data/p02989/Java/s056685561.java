import java.io.*;
import java.util.*;

public class Main {
    PrintWriter out = new PrintWriter(System.out);
    long mod = 1000000000+7;
    public static void main(String[] args) throws Exception {
        Main main = new Main();
//        main.solve();
        System.out.println(main.solve());
    }
    long solve(){
        // it's all about implementation
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxD = 100000;
        int[] cnt = new int[maxD+1];
        for(int i=0;i<n;i++){
            int d = sc.nextInt();
            cnt[d] += 1;
        }
        int smaller = 0, ans = 0;
        for(int i=1;i<=maxD;i++){
            smaller += cnt[i-1];
            if(smaller*2==n) ans += 1;
        }
        return ans;
    }
}

