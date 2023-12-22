import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;


public class Main {

    static int mod = (int) 1e9 + 7;
    public static final long pow(long x, long n) {
        long sum = 1;
        while (n > 0) {
            if ((n & 1) == 1) {  //ビットが立っていたら
                sum *= x;        //x^2^k1 * x^2^k2 * x^2^k3 * ・・・
            }
            x *= x;              //((x^2)^2)^2・・・
            n >>= 1;
        }
        return sum;
    }

    public static final long modPow(long a,long n,long p) {
        if (n == 1) return a % p;
        if (n % 2 == 1) return (a * modPow(a, n - 1, p)) % p;
        long t = modPow(a, n / 2, p);
        return (t * t) % p;
    }

    static long fermatComb(long a, long b) {
        if (b > a - b)
            return fermatComb(a, a - b);
        long mul = 1; //分子
        long div = 1; //分母
        for (int i = 0; i < b; i++) {
            mul *= (a - i);
            mul %= mod;
            div *= (i + 1);
            div %= mod;
        }
        long ans = mul * modpow(div, mod - 2) % mod; //フェルマーの小定理を利用して掛け算で計算
        return ans;
    }

    //mod条件下の高速pow
    static long modpow(long a, long p) {
        if (p == 0)
            return 1;
        if (p % 2 == 0) {
            long root = modpow(a, p / 2);
            return root * root % mod;
        } else
            return a * modpow(a, p - 1) % mod;
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        else if (num == 2) return true;
        else if (num % 2 == 0) return false; // 偶数はあらかじめ除く

        double sqrtNum = Math.sqrt(num);
        for (int i = 3; i <= sqrtNum; i += 2)
        {
            if (num % i == 0)
            {
                // 素数ではない
                return false;
            }
        }

        // 素数である
        return true;
    }



    public static void main(String[] args){
	// write your code here
        int[] plist=new int[100001];
        plist[0] = 0;
        for(int i=1;i<=100000;i++){
            if(isPrime(i)&&isPrime((i+1)/2)){
                plist[i] = plist[i-1] + 1;
            }else{
                plist[i] = plist[i-1];
            }
        }
        Scanner sc= new Scanner(System.in);
        int Q=sc.nextInt();
        int[] result=new int[Q];
        for(int i=0;i<Q;i++){
            int res = 0;
            int l=sc.nextInt();
            int r=sc.nextInt();
            res = plist[r] - plist[l-1];
            result[i]=res;

        }
        for(int i=0;i<Q;i++){
            System.out.println(result[i]);
        }



    }
}
