import java.util.Scanner;

/**
 * http://arc060.contest.atcoder.jp/tasks/arc060_a
 *  version-2
 * @author Cummin
 */

public class Main {
   
    static int N ;
    static int A ;
    static int plus[], minus[], zero[] ;
    static int plus_i, minus_i, zero_i ;
    
    public static void main(String[] args) {
//        System.out.printf("At Coder Regular Contest 060 問題C \n") ;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt() ;
        A = sc.nextInt() ;
        plus = new int[N];
        minus = new int[N] ;
        zero = new int[N] ;
        for (int i=0 ; i<N; i++) {
            plus[i] = 51; minus[i] = 51 ;
        }
        for (int i= 0 ; i<N; i++) {
            int x ;
            x = sc.nextInt() ;
            if (x<A) {
                minus[minus_i] = A - x ;
                minus_i ++ ;
            }else if (x>A) {
                plus[plus_i] = x - A ;
                plus_i ++ ;
            }else { // x==A
                zero[zero_i] = 0 ;
                zero_i ++ ;
            }
        }
        
        System.out.println(solve2()) ;    
    }
    
    static long solve2() {
        long cnt = 0 ;
        long plus_list[] = new long[2500] ;
        long minus_list[] = new long[2500] ;
        comb_list(plus_i, plus, plus_list) ;
        comb_list(minus_i, minus, minus_list) ;

        for (int i=1 ; i<2500; i++) {
            cnt = cnt + plus_list[i]*minus_list[i] ;
        }
     
        if (zero_i >0 ) {
            //System.out.printf("cnt=%d, zero_i=%d, p2=%d \n", cnt, zero_i, power_2(zero_i)) ;
            cnt = (cnt * power_2(zero_i)) + power_2(zero_i)-1 ; // plus/minusとゼロの組み合わせ + zeroだけで構成する場合
            return cnt ;
        } else 
            return cnt;
    }

    static void  comb_list(int n, int[] X, long list[]) {
        int max  ;
        list [0] = 1 ; // dummy (マーク用)
        max = 0 ;
        for (int i = 0; i < n ; i++) {
            // 1..maxの値を、X[i]だけシフトして加算コピーする, X[i]をマーク(1)
            for (int j=max; 0<=j ; j-- ){
                list[j + X[i]] = list[j + X[i]] + list[j] ;
            }
            max = max + X[i] ; 
        }
    }

    static int comb_add(long n, int[] X) {
        int count = 0;
        int sum = 0 ;
        while (n > 0) {
            if ((n & 0x01) == 1) {
                sum = sum + X[count];
            }
            count++;
            n = n >> 1;
        }
        return sum;
    }

    static long power_2(int n) { // n個の要素の組み合わせは、2^n通り
        long a = 1 ;
        for (int i=1 ; i<=n ; i++) {
            a = a+a ;
        }
        return a ;
    }
    
}
