import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int[] A = new int[M];

		for (int i = 0; i < M; i++) {
			A[i] = sc.nextInt();
		}
		int toZero = 0;
		int toN = 0;
		for (int a : A) {
			if (a > X) {
				toZero = toZero + 1;
			} else {
				toN = toN + 1;
			}
		}
		System.out.println(toZero > toN ? toN : toZero);

	}
}
