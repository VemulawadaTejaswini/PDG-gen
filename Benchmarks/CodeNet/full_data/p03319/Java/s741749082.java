
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	
	void run() {
		int n  = sc.nextInt();
		int k  = sc.nextInt();

		if(k==n){
			System.out.println(1);
			return;
		}
		
		int x = (n-1 + k - 2)/(k-1) ;
		System.out.println(x);
		
	}
}
