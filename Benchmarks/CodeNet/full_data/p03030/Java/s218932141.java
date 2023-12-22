import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String[] S = new String[N];
		int[] P = new int[N];
		int[] O = new int[N];
		for (int i = 0; i < N; i++) {
			S[i] = sc.next();
			P[i] = sc.nextInt();
			O[i] = i + 1;
		}
		for (int i = 0; i < N; i++) {
			int minj = i;
			for (int j = i; j < N; j++) {
				if (S[j].compareTo(S[minj]) < 0) {
					minj = j;
				} else {
					if (S[j].compareTo(S[minj]) == 0) {
						if (P[j] > P[minj]) {
							minj = j;
						}
					}
				}
			}
			String tmpS = S[i];
			int tmpP = P[i];
			int tmpO = O[i];
			S[i] = S[minj];
			P[i] = P[minj];
			O[i] = O[minj];
			S[minj]=tmpS;
			P[minj]=tmpP;
			O[minj]=tmpO;
		}
		for(int i=0;i<N;i++) {
			System.out.println(O[i]);
		}

	}
}