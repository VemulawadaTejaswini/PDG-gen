
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		a -= 2 * b;
		if(a > 0) {
			System.out.println(a);
		} else {
			System.out.println(0);
		}

	}

}
