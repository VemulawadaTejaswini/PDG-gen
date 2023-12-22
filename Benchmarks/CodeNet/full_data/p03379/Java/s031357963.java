import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] X = new int[N];
		int[] index = new int[N];

		for(int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
			index[i] = i;
		}
		int[] Y = X;

		for(int i = 0; i < N-1; i++) {
			for(int j = i+1; j < N; j++) {
				if(X[i] > X[j]) {
					int tmp = X[i];
					int tmpI = index[i];
					X[i] = X[j];
					index[i] = index[j];
					X[j] = tmp;
					index[j] = tmpI;
				}
			}
		}

		int ansL = X[N/2];
		int ansR = X[N/2-1];

		for(int i = 0; i < N-1; i++) {
			for(int j = i+1; j < N; j++) {
				if(index[i] > index[j]) {
					int tmp = X[i];
					int tmpI = index[i];
					X[i] = X[j];
					index[i] = index[j];
					X[j] = tmp;
					index[j] = tmpI;
				}
			}
		}

		for(int i = 0; i < N; i++) {
			if(X[i] < ansL) {
				System.out.println(ansL);
			} else {
				System.out.println(ansR);
			}
		}

	}

}