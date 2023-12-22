import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		long count = 0;
		while(h > 0) {
			h = h/2;
			count++;
		}
		System.out.println(pow(2,count)-1);
		sc.close();
	}
	public static long pow(long x, long n) {
	    long sum = 1;
	    while (n > 0) {
	        if ((n & 1) == 1) {
	            sum = sum * x;
	        }
	        x = x*x;
	        n >>= 1;
	    }
	    return sum;
	}
}