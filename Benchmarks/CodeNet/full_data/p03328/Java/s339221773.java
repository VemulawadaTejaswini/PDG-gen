import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		a = b - a;
		a = (1 + a) / 2 * a;
		System.out.println(a-b);
		
	}
}
