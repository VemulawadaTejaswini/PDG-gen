
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.valueOf(sc.next());
		String op = sc.next();
		int b = Integer.valueOf(sc.next());
		int ans = 0;
		if (op.equals("+"))
			ans = a + b;
		if (op.equals("-"))
			ans = a - b;
		System.out.println(ans);
		sc.close();
	}
}