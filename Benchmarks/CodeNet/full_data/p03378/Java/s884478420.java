import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int A[] = new int[M];
		for (int i=0;i<M;i++) {
			A[i] = sc.nextInt();
		}
		int countmin=0;
		int countmax=0;
		for (int i=0;i<M;i++) {
			if (A[i]<X) {
				countmin++;
			} else {
				countmax++;
			}
		}
		if (countmin<countmax) {
			System.out.println(countmin);
		} else {
			System.out.println(countmax);
		}
	}
}