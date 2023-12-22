
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if(n > 1) {
			n -= 2;
		}
		if(m > 1) {
			m -= 2;
		}
		System.out.println(n * m);
	}

}
