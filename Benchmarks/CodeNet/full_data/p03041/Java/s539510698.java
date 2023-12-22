import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Input
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());

		String[] S = new String[N];
		for(int i = 0 ; i < N ; i++ ) {
			S[i] = sc.next();
		}

		sc.close();

		//Logic
		S[K-1] = S[K-1].toLowerCase();

		//Output
		for(int i = 0 ; i < N ; i++ ) {
			System.out.print(S[i]);
		}
	}

}
