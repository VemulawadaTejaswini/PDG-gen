

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");
//    	Scanner sc = new Scanner(file);

    	Scanner sc = new Scanner(System.in);

    	int X = sc.nextInt();
    	int Y = sc.nextInt();
    	long p = 1000000007;

    	int a = 2*X-Y;
    	int b = 2*Y-X;

    	if(a<0||(a%3!=0)||b<0||(b%3!=0)) {
    		System.out.println("0");
    	} else {
    		a /= 3;
    		b /= 3;
    		if(a<b) {
    			int tmp = a;
    			a = b;
    			b = tmp;
    		}
    		long times = 1;
    		for(int i = b+1;i<=a+b;i++) {
    			times *= i;
    			times = times %p;

    		}
    		long fracA = 1;
    		for(int i=1;i<=a;i++) {
    			fracA *= i;
    			fracA = fracA%p;
    		}
    		long times2 = modPow(fracA,p-2,p);
    		if(times*times2<p) {
    			System.out.println(times*times2);
    		} else {
    			System.out.println((times*times2)%p);
    		}
    	}
    }
    public static final long modPow(long x, long n, final long mod) {
        long sum = 1;
        while (n > 0) {
            if ((n & 1) == 1) {      //ビットが立っていたら
                sum = sum * x % mod; //x^2^k1 * x^2^k2 * x^2^k3 * ・・・
            }
            x = x * x % mod;         //((x^2)^2)^2 ・・・
            n >>= 1;
        }
        return sum;
    }

}
