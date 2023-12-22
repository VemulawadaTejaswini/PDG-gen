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
        long res = 1+count(N-1);
        for(long k=2; k<=Math.sqrt(N); k++){
            if((N-1)%k!=0 && isFeasible(N, k)){
                res++;
            }
        }
        System.out.print(res);
    }

    public static boolean isFeasible(long N, long k){
        while(N%k==0 && N>=k){
            N = N/k;
        }
        if(N>=k){
            N %= k;
        }
        return N==1;
    }

    public static long count(long n){
        int res = 0;
        for(long i=1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                res+=2;
            }
        }
        return res-1;
    }
}
