import java.util.*;
import java.io.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    long mod = 998244353;
    long[] frac, inv;
    public static void main(String[] args){
        Main main = new Main();
//        String ans = main.solve()<0?"No":"Yes";
//        System.out.println(main.solve());
        main.solve();
    }
    long solve(){
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        int[] cnt = new int[n+10];
        for(int num:a) cnt[num]++;
        long total = 0;
        for(int num:cnt){
//            if(num<=1) continue;
            total += ((long)num)*(num-1)/2;
        }
        for(int i=0;i<n;i++){
            int cur = cnt[a[i]];
            long temp = total - cur+1;
            out.println(temp);
        }
        out.flush();
        return 1;

    }
}
