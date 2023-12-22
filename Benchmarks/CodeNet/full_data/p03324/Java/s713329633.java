import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int d = scan.nextInt();
		int n = scan.nextInt();
		
		if(d == 0) {
			System.out.println(n);
		} else {
			System.out.println((int)Math.pow(100, d) * n);
		}
	}
}
