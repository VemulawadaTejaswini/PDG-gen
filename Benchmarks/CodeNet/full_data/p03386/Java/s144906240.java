import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        
        Set<Integer> set = new TreeSet<>();
        for(int i = 0; i < K; i++) {
            if( A + i <= B )  set.add( A + i );
            if( B - i >= A )  set.add( B - i );
        }
        
        for( int x : set ) {
            System.out.println( x );
        }
    }
}
