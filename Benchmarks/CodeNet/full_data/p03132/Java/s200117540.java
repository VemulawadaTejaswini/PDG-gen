import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        long[] A = new long[L+1];
        for(int i=1;i<=L;i++) A[i]=sc.nextLong();
        // leftBack requires come back at i, while left requires not coming back
        if(L==1){
            System.out.println(A[1]);
            return;
        }
        long[] leftSum = new long[L+1];
        for(int i=1;i<=L;i++) leftSum[i] = leftSum[i-1]+A[i];
        long[] leftBack = new long[L+1],left = new long[L+1];
        for(int i=1;i<=L;i++){
            leftBack[i] = Math.min(leftSum[i],leftBack[i-1]+(A[i]==0?2:A[i]%2));
            left[i] = Math.min(leftBack[i-1],left[i-1])+(1-A[i]%2);
        }
        long[] rightSum = new long[L+2];
        for(int i=L;i>=0;i--) rightSum[i] = rightSum[i+1]+A[i];
        long[] rightBack = new long[L+1], right = new long[L+1];
        for(int i=L-1;i>=0;i--){
            rightBack[i] = Math.min(rightSum[i+1],rightBack[i+1]+(A[i+1]==0?2:A[i+1]%2));
            right[i] = Math.min(rightBack[i+1],right[i+1])+(1-A[i+1]%2);
        }
        long ans = Long.MAX_VALUE;
        for(int i=0;i<=L;i++){
            long cur = Math.min(leftBack[i]+right[i],left[i]+rightBack[i]);
            ans = Math.min(ans,cur);
        }
        System.out.println(ans);
    }
}
