
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		int n = sc.nextInt();
		int[] a = new int[n];
		
		boolean isEven = true;
		for(int i = 0; i < n ; i++){
			a[i] = sc.nextInt();
			isEven = isEven && a[i] % 2==0;
		}
		
		System.out.println(isEven?"second":"first" );
		
	}
	
	
}
