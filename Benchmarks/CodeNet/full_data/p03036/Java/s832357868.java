import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		int D = sc.nextInt();
		int x = sc.nextInt();

		int[] X = new int[11];
		X[0] = x;

		for(int i=0;i<10;i++) {
			X[i+1]=r*X[i] -D;


		}
		for(int i=0;i<10;i++) {
			System.out.println(X[i+1]);
		}

	}

}
