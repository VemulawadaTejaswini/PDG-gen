import java.util.Arrays;
import java.util.Scanner;

/**
 * http://arc060.contest.atcoder.jp/tasks/arc060_a
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
                //System.out.printf("minus[%d]=%d\n", minus_i, A-x) ;
                minus_i ++ ;
            }else if (x>A) {
                plus[plus_i] = x - A ;
                plus_i ++ ;
            }else { // x==A
                zero[zero_i] = 0 ;
                zero_i ++ ;
            }
        }
        Arrays.sort(plus);
        Arrays.sort(minus) ;
        
        System.out.println(solve()) ;    
    }
    
    static long solve() {
        long cnt = 0 ;
        for (int i = 1; i <= power_2(plus_i)-1; i++) {
            int plus_sum ;
            plus_sum = comb_sum((long) i, plus) ;
            // 探索範囲を決める
            int minus_add = 0;
            int minus_low = 0;
            for (int j = 0; j < minus_i; j++) {
                if (minus_add < plus_sum) {
                    minus_add = minus_add + minus[j];
                } else {
                    minus_low = j;
                    break;
                }
            }
            int minus_hi = minus_i ;
            for (int j = 0; j < minus_i; j++) {
                if (minus[j] >= plus_sum) {
                    minus_hi = j;
                    break;
                }
            }
            for (long j = power_2(minus_low) - 1; j <= power_2(minus_hi); j++) {
                if (comb_sum(j, minus) == plus_sum) {
                    cnt++;
                }
            }
        }
        if (zero_i >0 ) {
            //System.out.printf("cnt=%d, zero_i=%d, p2=%d \n", cnt, zero_i, power_2(zero_i)) ;
            cnt = (cnt * power_2(zero_i)) + power_2(zero_i)-1 ; // plus/minusとゼロの組み合わせ + zeroだけで構成する場合
            return cnt ;
        } else 
            return cnt;
    }

    static int comb_sum(long n, int[] X) {
            int count = 0;
            int sum = 0;
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
    static int add_comb(int[] v, long n) { // nの桁(i)にbitが立っている場合、plus[i]を加算
        int ans = 0 ;
        int bit = 1 ;
        for (int i = 1; i <= n ; i++) {
            if (( i & bit)!=0) {
                ans = ans + plus[i] ;
            }
        }
        return ans ;
    }
    
}
