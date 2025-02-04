
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		
		int n = sc.nextInt();
		int s[]= new int[n];
				
		for(int i = 0 ; i < n ;i++) {
			s[i] = sc.nextInt();
		}
		

		long max = 0;
		for(int i = 1 ; i < n ; i++) {
			
			long score = -s[0];
			for(int j = 0; j < n && ((n-1)%i != 0 || j < n-1-j) ;j += i) {
				score += s[j] + s[n-1-j];
				max = Math.max(score, max);
//				System.out.println(i+" "+j+" "+score);
			}
			
		}
		if(n < 5) {
			s[n+1] = 10;
		}
		
		System.out.println(max);
		
	}
}
