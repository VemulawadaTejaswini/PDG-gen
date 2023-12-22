import java.util.*;
import java.io.*;

/*
   AtCoder contest
   coder : yoichidon
 */
public class Main {

    public  static long[] reverse(long[] array){
        int N = array.length;
        long[] ans = new long[N];
        for(int n=0; n<N; n++) ans[n]=array[N-n-1];
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        long[] A = new long[L];
        for(int l=0; l<L; l++) A[l]=sc.nextLong();
        long[] B = reverse(A);


        long[] sum = new long[L+1];
        long[] loopL = new long[L+1];
        long[] endL = new long[L+1];
        long[] loopR = new long[L+1];
        long[] endR = new long[L+1];

        sum[0]=0;
        for(int l=1; l<=L; l++) sum[l] = sum[l-1]+A[l-1];

        loopL[0]=0;
        for(int l=1; l<=L; l++){
            long a = A[l-1];
            if(a==0) loopL[l] = Math.min(sum[l-1], 2+loopL[l-1]);
            else loopL[l] = loopL[l-1] + a%2;
        }

        endL[0]=0;
        for(int l=1; l<=L; l++){
            long a = A[l-1];
            if(a==0) endL[l] = Math.min(sum[l-1], 1+endL[l-1]);
            else if(a%2>0) endL[l] = endL[l-1];
            else endL[l] = Math.min(1+endL[l-1], loopL[l]);
        }

        sum[0]=0;
        for(int l=1; l<=L; l++) sum[l] = sum[l-1]+B[l-1];

        loopR[0]=0;
        for(int l=1; l<=L; l++){
            long b = B[l-1];
            if(b==0) loopR[l] = Math.min(sum[l-1], 2+loopR[l-1]);
            else loopR[l] = loopR[l-1] + b%2;
        }

        endR[0]=0;
        for(int l=1; l<=L; l++){
            long b = B[l-1];
            if(b==0) endR[l] = Math.min(sum[l-1], 1 + endR[l-1]);
            else if(b%2>0) endR[l] = endR[l-1];
            else endR[l] = Math.min(1+endR[l-1], loopR[l]);
        }

        long ans = Long.MAX_VALUE;
        for(int l=0; l<=L; l++) ans = Math.min(ans, endL[l]+endR[L-l]);
        System.out.println(ans);


    }
}
