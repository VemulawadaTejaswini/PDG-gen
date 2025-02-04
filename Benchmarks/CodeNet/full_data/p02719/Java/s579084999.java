import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long K = scanner.nextLong();
        if(N % K == 0){
            System.out.println(0);
            return;
        }
        if( N < K ){
            long mi = Math.min(N, K-N);
            System.out.println(mi);
            return;
        }
        while(K != 0){
            N = N % K;
            long temp = N;
            N = K;
            K = temp;
        }
        System.out.println(N);
    }
}