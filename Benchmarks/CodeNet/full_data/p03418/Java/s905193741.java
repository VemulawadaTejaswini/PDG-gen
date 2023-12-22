import java.util.Scanner;
import java.util.Arrays;

public class Main {

public static void main(String [] args){

        long N,K;
        long count =0;
        Scanner input = new Scanner(System.in);

        N = input.nextLong();
        K = input.nextLong();

        if (K ==0) {
                count =N*N;
        }else{
                for (long b=K+1; b<=N; b++ ) {
                        count += N/b * (b-K);
                        if (N%b > K-1) {
                                count += N%b-(K-1);
                        }
                }
        }


        System.out.println(count);
}
}
