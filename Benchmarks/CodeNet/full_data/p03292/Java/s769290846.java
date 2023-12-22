
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int ab = Math.abs(a - b);
		int bc = Math.abs(b - c);
		int ca = Math.abs(c - a);
		int ans = ab + bc + ca - Math.max(ab, Math.max(bc, ca));
		System.out.println(ans);

	}

}
