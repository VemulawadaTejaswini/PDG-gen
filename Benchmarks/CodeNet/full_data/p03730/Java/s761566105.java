import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();

		if(Math.abs(B - A) >= C) System.out.print("YES");
		else System.out.print("NO");
	}
}