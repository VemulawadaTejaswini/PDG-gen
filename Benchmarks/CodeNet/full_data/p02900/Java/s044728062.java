import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();

        if(a > b) {
        	long w = a;
        	a = b;
        	b = w;
        }

        if(a == 1) {
        	System.out.println(1);
        	return;
        }else if(a == 2){
        	if(b%2 == 0) {
        		System.out.println(2);
        		return;
        	}else {
        		System.out.println(1);
        		return;
        	}
        }

        int amari = 0;
        if(b%a==0 && isPrime(a)) {
        	amari = 1;
        }

        System.out.println(func(a,b)+amari);
        return;
    }


    static boolean isPrime(final Long i2) {
        // 平方根まで判定すれば、良いです。
        final double sqrtNum = Math.sqrt(i2);
        for (int i = 3; i <= sqrtNum; i += 2) {
            if (i2 % i == 0) {
                return false;
            }
        }
        return true;
    }

    static long func(final long a, final long b) {
        HashSet<Long> primes = new LinkedHashSet<>();
        primes.add((long) 1);
        if(a%2==0&&b%2==0)
        	primes.add((long) 2);// 最初の素数2を初期値として格納しておく
        Long i = (long) 3;// 最初のループでi=1+2=3となり3から素数判定する
        while (i < a) {
        	if(a%i==0 && b%i==0) {
                if (isPrime(i)) {
                    primes.add(i);
                }
            }
            i += 2;// 偶数をスキップ
        }
        return primes.size();
    }

}