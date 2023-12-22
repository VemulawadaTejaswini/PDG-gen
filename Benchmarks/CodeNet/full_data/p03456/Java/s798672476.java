import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a, b;
		a = sc.next();
		b = sc.next();
		int x = Integer.parseInt(a + b);
		boolean isSquare = false;
		for (int i = 1; i <= 100; i++) {
			if(i * i == x) {
				isSquare = true;
				break;
			}else {
				isSquare = false;
			}
		}
		if(isSquare) System.out.print("Yes");
		else System.out.print("No");
	}
}