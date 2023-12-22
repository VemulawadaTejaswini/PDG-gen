import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] A = new int[N];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            A[i] = in.nextInt();
            max = Math.max(max, A[i]);
        }
        int highest = 0; // 为1的最高位
        while(max!=0){
            highest ++;
            max = max >> 1;
        }
        
        
        long[] sum = new long[N];
        int[] xorSum = new int[N];
        sum[0]=(long) A[0];
        xorSum[0] = A[0];
        
        
        for(int i=1;i<N;i++){
            sum[i] = sum[i-1]+A[i];
            xorSum[i] = xorSum[i-1]^A[i];
        }
        long result = (long) N;
        // l = 0 case
        for(int r=1;r<N;r++){
            if(sum[r]>=(1<<(highest+1))) break;
            if(sum[r]==xorSum[r]) result ++;
        }
        // l >= 1 case
        for(int l=1;l<N-1;l++){
            for(int r=l+1;r<N;r++){
                if((sum[r]-sum[l-1])>=(1<<(highest+1))) break;
                if((sum[r]-sum[l-1])==(xorSum[r]^xorSum[l-1])) result ++;
            }
        }
        System.out.println(result);

    }
}