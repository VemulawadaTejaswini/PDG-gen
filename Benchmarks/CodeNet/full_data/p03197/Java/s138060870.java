
import java.util.Scanner;

public class Main{
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		int []a = new int [n];
		boolean p = false;
		for(int i = 0 ; i < n ;i++) {
			a[i] = Integer.parseInt(sc.next());
			if(a[i] % 2 != 0) {
				p = true;
			}
		}
		
		if(p) {
			System.out.println("first");
		}
		else {
			System.out.println("second");
		}
		
		
	
	}
}
