import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	long n = scanner.nextLong(), a = scanner.nextLong(), b = scanner.nextLong();
    	if (n % (a+b) == 0) {
    		System.out.println(n/(a+b) * a);
    	}else {
    		long z = n / (a+b);
    		z = Math.max(0, z);
    		n -= z * (a+b);
    		long res = 0;
    		if (n > a) {
    			res = z * a + a;
    		}else {
    			res = z * a + n;
    		}
    		System.out.println(res);
    	}
    	}
    }
