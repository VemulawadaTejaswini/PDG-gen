import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void doIt() {
		long n = sc.nextLong();
		long sum = 0;
		int root_n = (int)Math.ceil(Math.sqrt(n));
		for(int i = 1; i < root_n; i++) {
			if(n % i == 0) {
				sum += n / i - 1;
			}
			
		}
		System.out.println(sum);
		
	}
	
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
