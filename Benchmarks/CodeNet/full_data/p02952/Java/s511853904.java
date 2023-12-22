
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		if(n<10) {
			System.out.println(n);
			return;
		}
		if(n<100) {
			System.out.println(9);
			return;
		}
		if(n<1000) {
			System.out.println(n-99+9);
			return;
		}
		if(n<10000) {
			System.out.println(909);
		return;
		}
		if(n<100000) {
			System.out.println(n-9999+909);
			return;
		}
		System.out.println(90909);
	}

}
