import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        
        int max = Math.max( A, Math.max(B, C) );
        int sum = (int)Math.pow(2, K) * max;
        if( max == A) {
            sum += B + C;    
        } else if( max == B ) {
            sum += C + A;
        } else if( max == C ) {
            sum += A + B;
        }
        System.out.println( sum );
    }
}
