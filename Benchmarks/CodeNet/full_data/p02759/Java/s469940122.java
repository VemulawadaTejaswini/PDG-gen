import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		if (n % 2 == 0) {
			n/=2;
			System.out.println(n);
		} else {
			n/=2;
			n++;
			System.out.println(n);
		}
		
	}

}