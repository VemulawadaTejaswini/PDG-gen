import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X1, Y1, X2, Y2, X3, Y3, X4, Y4;
		X1 = sc.nextInt();
		Y1 = sc.nextInt();
		X2 = sc.nextInt();
		Y2 = sc.nextInt();
		sc.close();

		X3 = Y1 - Y2;
		X4 = X3;
		Y4 = Y1;
		Y3 = Y2;
		System.out.println(X3 + " " + Y3 + " " + X4 + " " + Y4);
	}
}
