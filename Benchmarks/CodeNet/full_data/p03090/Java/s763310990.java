import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		int n = sc.nextInt();
		
		if(n % 2 ==0 ) {
			System.out.println((n)*(n-2)/2);
			for(int i = 1 ; i <= n; i++) {
				for(int j = i+1; j <=n ; j++) {
					if(i+j == n+1) {
						continue;
					}
					System.out.println(i+" "+j);
				}
			}
			
		}else {
			System.out.println((n-1)*(n-3)/2 + n-1);

			for(int i = 1 ; i <= n-1; i++) {
				for(int j = i+1; j <=n-1 ; j++) {
					if(i+j == n) {
						continue;
					}
					System.out.println(i+" "+j);
				}
			}
			for(int i = 1 ; i < n ; i++) {
				System.out.println(i + " "+n);
			}
		}		
	}
}