import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void doIt() {
		long n = sc.nextLong();
		long sum = 0;
		for(long i = 1; i * i < n; i++) {
			if(n % i == 0) {
				sum += n / i - 1;
				System.out.println(i * i);
			}			
		}
		System.out.println(sum);
		
	}
	
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
