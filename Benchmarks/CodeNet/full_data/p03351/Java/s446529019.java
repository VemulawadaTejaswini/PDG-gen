import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int x = Math.abs(a - b);
		int y = Math.abs(b - c);
		int z = Math.abs(a - c);
		boolean ans = false;
		if (x + y <= d || z <= d) {
			ans = true;
		}
		System.out.println(ans ? "Yes" : "No");
	}

}
