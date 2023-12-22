import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int K =sc.nextInt(),A=sc.nextInt(),B=sc.nextInt();
        long ans = help(K,A,B);
        System.out.println(ans);
    }
    static long help(long K, long A, long B){
        if(B-A<=2) return K+1;
        if(K==1) return 2;
        if(1+K-2<A) return 1+K; // after K-2 operations still can't reach A biscuits
        long ans = A;
        K -= A-1;
        ans += K/2*(B-A)+K%2;
        return ans;
    }
}
