import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		int answer = A%B;
		System.out.println(Math.min(B-answer, answer));
	}
}