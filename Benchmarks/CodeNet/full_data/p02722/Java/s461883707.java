import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Created by Harry on 4/7/20.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        long N = scanner.nextLong();
        if(N==2){
            System.out.print(1);
            return;
        }
        long res = 2;
        for(long k=2; k*k<N; k++){
            if(isFeasible(N, k)){
                res++;
            }
        }
        res += count(N);
        System.out.print(res);
    }

    public static boolean isFeasible(long N, long k){
        if(N%k==0){
            while(N%k==0){
                N /= k;
            }
            return N%k==1;
        }
        return false;
    }

    public static long count(long N){
        int res = 0;
        for(int k=2; k*k<=N; k++){
            if(N%k!=0 && (N-1)%k==0){
                res++;
                if(k*k!=(N-1)){
                    res++;
                }
            }
        }
        return res;
    }
}
