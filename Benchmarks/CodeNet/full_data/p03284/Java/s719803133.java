import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		if(n % k == 0) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
		
	}
}