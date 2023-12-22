import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int A, B, C;
		Scanner scanner = new Scanner(System.in);

		A = scanner.nextInt();
		B = scanner.nextInt();
		C = scanner.nextInt();

		if(A == B && B == C && C == A)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}