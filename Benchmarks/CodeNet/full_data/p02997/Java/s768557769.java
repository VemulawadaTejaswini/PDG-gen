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
        int n = sc.nextInt(), k = sc.nextInt();
        if(k>=(n-1)*(n-2)/2) return -1;
        int m = n-1,diff = (n-1)*(n-2)/2-k;
        m += diff;
        out.println(m);
        // first print the star, setting "1" as the center
        for(int i=2;i<=n;i++) out.println(String.format("%d %d",1,i));
        // then connect the resulting map diff times
        while(diff>0){
            for(int i=2;i<n&&diff>0;i++){
                for(int j=i+1;j<=n&&diff>0;j++){
                    out.println(String.format("%d %d",i,j));
                    diff--;
                }
            }
        }
        out.flush();
        System.exit(0);
        return -1;
    }
}

