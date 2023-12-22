import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = Integer.parseInt(Integer.toString(a)+Integer.toString(b));
		int d = (int)Math.sqrt(c);
		boolean isSquare = c == d*d;
		System.out.println(isSquare ? "Yes" : "No");
	}
}
