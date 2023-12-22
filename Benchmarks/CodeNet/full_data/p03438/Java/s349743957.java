import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long countA= 0;
		long countB=0;
		for (int i=0;i<N;i++) {
			countA+=sc.nextInt();
		}
		for (int i=0;i<N;i++) {
			countB+=sc.nextInt();
		}
		if (countB>=countA) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
