import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long k = sc.nextLong();
		long min = sum(k*2);
		
		for(int i = 3; i < 1000000; i++) {
			if(sum(k * i)<min) {
				min = sum(k*i);
			}
		}
		System.out.println(min);

	}
	
	private static long sum(long n) {
		long r = 0;
		do {
			r += n%10;
			n /= 10;
		} while(n > 0);
		return r;
	}

}
