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
		

		long max = s[n-1];
		for(int i = 1 ; i < n ; i++) {
			
			long score = 0;
			for(int j = i , jj = n-1-i ; j != i && j < n && ( n % i !=0 || j < jj) ;j+=i ,jj -= i) {
				score += s[j] + s[n-1-j];
				max = Math.max(score, max);
			}
		}
		
		System.out.println(max);
		
	}
}
