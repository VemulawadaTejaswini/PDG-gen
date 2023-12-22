import java.util.Scanner;

public class Main {
	

	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		if(n%3==0) {
			System.out.println((n/3)*(n/3)*(n/3));
		}
		else {
			
			System.out.println((n/3)*(n/3)*(n-2*(n/3)));
		}
		
		
	}
}