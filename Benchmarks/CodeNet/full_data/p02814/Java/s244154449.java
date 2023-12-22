import java.util.*;

class Main {
    int N;
    long M;
    long[] A;

    public Main(){
        Scanner SC = new Scanner(System.in);
        N = SC.nextInt();
        M = SC.nextLong();
        A = new long[N];

        for(int i=0;i<N;i++){
            A[i] = SC.nextLong() / 2;
        }

        long valueLCM = valueLCM = LCM(A[0], A[1]);
        for(int i=1;i<N-1;i++){
            valueLCM = LCM(valueLCM, A[i+1]);
        }

        long L=-1, R=(M+1)/2;
        while(R-L > 1){
            long mid = L+(R-L)/2;

            if(valueLCM * (2*mid+1) > M)
                R = mid;
            else
                L = mid;
        }

        System.out.println(R);
    }

    long LCM(long val1, long val2){
        long maxValue = Math.max(val1, val2);
        long minValue = Math.min(val1, val2);

        if(minValue == 0) return maxValue;

        long val3 = maxValue * minValue;

        long temp = maxValue%minValue;
        while( temp != 0 ){
            maxValue = minValue;
            minValue = temp;
            temp=maxValue%minValue;
        }

        return val3/minValue;
    }

    public static void main(String[] args){
        Main m = new Main();
    }
}
