import java.util.*;

class Disjoint_Set_of_Common_Divisors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        long gcd = get_great_common_divisor(a,b);
        //System.out.println(gcd);
        int count = prime_factorization(gcd);
        System.out.println(count);
    }

    //最大公約数を返すメソッド
    public static long get_great_common_divisor(long a,long b) {
        long gcd=0;
        /*if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }*/

        //余りがでなければ終了
        if (a % b == 0) {
            return b;
        }

        gcd = a % b;
        return get_great_common_divisor(b,gcd);
        
    }

    //素因数分解するメソッド
    public static int prime_factorization(long n) {
        long y = n;
        int count = 1;

        //切り上げのため+1
        n = (int)Math.sqrt(n) + 1;
        for(int i=2; i<=n; i++){
            if(y % i == 0) count++;
            while(y % i == 0){
                y /= i;  
            }
            //yが√nより早めに割り切れた場合、無駄削減
            if(y == 1) {
                break;
            }

            if(i == n) {
                count++;
            }
        }
        return count;
    }
}