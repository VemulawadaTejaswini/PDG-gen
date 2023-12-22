import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] T = new int[N];
		int[] X = new int[N];
		int[] Y = new int[N];
		for(int i = 0;i < N;i++) {
			T[i] = Integer.parseInt(sc.next());
			X[i] = Integer.parseInt(sc.next());
			Y[i] = Integer.parseInt(sc.next());
			if(!(T[i]%2==(X[i] + Y[i])%2)
					|| X[i] + Y[i] > T[i]) {
				System.out.println("No");
				sc.close();
				return;
			}
		}
		sc.close();
		System.out.println("Yes");
	}
}