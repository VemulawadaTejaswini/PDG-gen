import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		System.out.println(Math.min(A, B) + " " +Math.max(0, A + B - N));
	}
}