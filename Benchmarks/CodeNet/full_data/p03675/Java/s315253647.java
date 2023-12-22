import java.util.*;

public class Main{
    public static long mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){

        int N = sc.nextInt();

        int k = 1;
        Deque<Integer> d = new ArrayDeque<Integer>();
        for( int i = 0; i < N; i++,k++ ){
            if( k%2 == 0 ){
                d.offerFirst( sc.nextInt() );
            }else{
                d.offerLast( sc.nextInt() );
            }
            // if( i % 3 == 2 ) k++;
        }

        int ind = 1;
        if( k%2 == 1 ){
            while( d.peekLast() != null ){
                System.out.printf( "%d%c", d.pollFirst(), ind == N ? '\n' : ' ' );
                ind++;
            }
        }else{
            while( d.peekLast() != null ){
                System.out.printf( "%d%c", d.pollLast(), ind == N ? '\n' : ' ' );
                ind++;
            }
        }


    }
}


