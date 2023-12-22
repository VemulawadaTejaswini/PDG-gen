import java.util.Scanner;
import java.util.Arrays;

public class Main {

public static void main(String [] args){

        int N,K;
        int count =0;
        Scanner input = new Scanner(System.in);

        N = input.nextInt();
        K = input.nextInt();

        if (K ==0) {
                count = N*N;
        }else{
                for (int a=K; a<=N; a++ ) {
                        for (int b=K; b<=a; b++ ) {
                                if (a%b >=K) {
                                        count++;
                                }
                        }
                }
                count += (N-K+1)*(N-K)/2;
        }
        System.out.println(count);
}
}
