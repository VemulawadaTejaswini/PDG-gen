import java.util.Scanner;

/**
 * http://arc060.contest.atcoder.jp/tasks/arc060_c
 * 
 * @author Cummin
 */
public class Main {
        static int N ;  // 2 <= N <= 10^5
        static long L ; // 1 <= L <= 10^9
        static int Q ;  // 2 <= Q <= 10^5
        static int X[] ;

        public static void main(String[] args) {
//        System.out.printf("At Coder ARC060 問題E \n") ;
        /**/    
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt() ;
        X = new int[N] ;  // 1 <= X <= 10^9, X[0..N-1]
        for (int i=0 ; i<N; i++) {
            X[i]= sc.nextInt() ;
        }
        L = sc.nextLong() ;
        Q = sc.nextInt() ;
        int Qs[][] = new int[Q][2] ; // Qs[][from] < Qs[][to]
        for (int i=0 ; i<Q ; i++) {
            int from, to ;
            from = sc.nextInt() ;
            to   = sc.nextInt() ;
            if (from>to) {
                int t ;
                t = from; from = to ; to = t ;
            }
            Qs[i][0] = from - 1 ;
            Qs[i][1] = to - 1 ;
        }
        for (int i = 0 ; i<Q ; i++) {
            System.out.println(Solve(Qs[i][0], Qs[i][1])) ;
        }
    }
    
    static int Solve(int from, int to) {
        int max = from ;
        for (int i=from+1 ; i<=to; i++){
            if ((X[i]-X[from])<=L) {
                max = i ;
            }            
        }
//        System.out.printf("from =%d, to=%d len=%d \n", from+1, max+1,X[max]-X[from]) ;
        if (max == to) {
            return 1 ;
        } else {
            return Solve(max, to) +1 ;
        }
    }
 }
