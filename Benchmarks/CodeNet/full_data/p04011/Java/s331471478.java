import java.util.*;


public class Main {
	
	Scanner cin = new Scanner(System.in);
	
	public static void main(String[] args) {
		new Main().run(); 
	}
	
	public void run() {		
		
		/*input*/
		
		int n = cin.nextInt();
		int k = cin.nextInt();
		int x = cin.nextInt();
		int y = cin.nextInt();
		
		/*start*/
		
		int total = 0;
		
		if (n <= k) {
			
			total = n * x;		
		} else {
			
			total = k * x;
			total += (n-k) *y;
		}
		
		/*finish*/
		System.out.println(total);
	}
}

