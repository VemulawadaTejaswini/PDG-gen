import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long N,A,B;
        N = scan.nextLong();
        A = scan.nextLong();
        B = scan.nextLong();
        long [] ball = new long [(int)N];
        long total = A+B;
        for(long i= 0;i<N;i++){
            if((i+1)%total<A){
                ball[(int)i] = 1;
            }
        }
        long count=0;
        for(long i= 0;i<N;i++){
            if(ball[(int)i]==1){
                count += 1;
            }
        }
        System.out.println(count);
    }
}