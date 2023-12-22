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
        
        if (plus_i > minus_i) {
            int x ;
            x = plus_i ; plus_i = minus_i; minus_i = x ;
            int xx[] ;
            xx = plus ; plus = minus ; minus = xx ;
        }
        
        System.out.println(solve()) ;    
    }
    
    static long solve() {
        long cnt = 0 ;
        int plus_sum[] ;
        plus_sum = comb_list(plus_i, plus) ;
        int plus_ptr = 0 ;

        for (long j = 1; j < power_2(minus_i); j++) {
            int minus_sum;
            minus_sum = comb_add(j, minus);
            for (int i = 1; i < power_2(plus_i); i++) {
                //System.out.printf("plus_sum[%d]=%d, minus_sum[j=%d]=%d, plus_ptr=%d \n", i, plus_sum[i],j, minus_sum, plus_ptr);
                //if (minus_sum < plus_sum[i]) continue ;
                if (plus_sum[i] == minus_sum) {
                    cnt++ ;
                    continue ;
                }
                //if (plus_sum[i] < minus_sum) continue ;
            }
        }
     
        if (zero_i >0 ) {
            //System.out.printf("cnt=%d, zero_i=%d, p2=%d \n", cnt, zero_i, power_2(zero_i)) ;
            cnt = (cnt * power_2(zero_i)) + power_2(zero_i)-1 ; // plus/minusとゼロの組み合わせ + zeroだけで構成する場合
            return cnt ;
        } else 
            return cnt;
    }

    static int[] comb_list(int n, int[] X) {
        // n<= 25 程度である必要がある
        int sum[] = new int[(int) power_2(n)];
        for (int i = 0; i < n ; i++) {
            for (int j= (int) power_2(i) ; j< power_2(i+1) ; j++) {
                 sum[j] = sum[j%2] + X[i];
            }
        }
        //Arrays.sort(sum);
        return sum;
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
