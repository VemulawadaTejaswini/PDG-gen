import java.util.*;

import javax.lang.model.util.ElementScanner6;

public class Main{
    static long[] sum, p;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        long X = sc.nextLong();
        sc.close();

        sum = new long[N+1];
        p = new long[N+1];
        for(int i = 0; i < N+1; i++){
            if(i == 0){
                sum[0] = 1;
                p[0] = 1;
            } else {
                sum[i] = 2*sum[i-1]+3;
                p[i] = 2*p[i-1]+1;
            }
        }
        System.out.println(ans(N, X));
    }
    static long ans(int N, long X){
        if(X == 1){
            return 0;
        } else {
            if(1 < X && X <= 2+sum[N-1]){
                return ans(N-1, X-1);
            } else //if(2+sum[N-1]< X && X<= 3+2*sum[N-1]){
                return p[N-1]+1+ans(N-1, X-2-sum[N-1]);
        }
    }
}