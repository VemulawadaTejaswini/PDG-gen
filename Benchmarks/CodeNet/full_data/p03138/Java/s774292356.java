import java.util.*;
import java.io.*;

/*
   AtCoder contest
   coder : yoichidon
 */


public class Main {
    static long dthDigit(long num, int d){
        return (num & 1<<d)>>d;
    }
    static long solve(long K, long[] A){
        int N = A.length;
        long ans = 0;
        boolean free = false;
        for(int d=45; d>=0; d--){
            if(dthDigit(K,d)==0 && !free) continue;

            int dig1=0, dig0=0;
            for(int n=0; n<N; n++){
                if(dthDigit(A[n],d)>0) dig1++;
                else dig0++;
            }

            if(dig1>=dig0){ //ans[d-th digit]=0
                if(dthDigit(K,d)>0) free=true;
            }else{
                ans += 1<<d;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        long[] A = new long[N];
        for(int n=0; n<N; n++) A[n]=sc.nextLong();

        long X = solve(K,A);
        long ans = 0;
        for(int n=0; n<N; n++) ans += (A[n] ^ X);

        System.out.println(ans);

    }
}
