import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int X = sc.nextInt();

		for(int i = 0; i < N; i++) {
			int A = sc.nextInt();
			X += (D-1)/A +1;
		}

		System.out.println(X);
	}

}
