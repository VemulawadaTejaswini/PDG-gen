import java.util.Scanner;

class Main {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int K = scanner.nextInt();

		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
		}
		
		scanner.close();

		double[] dd = new double[N];
		for (int i = 0; i < N; i++) {
			dd[i] = (1.0+ arr[i]) / 2.0;
		}
		
		double sm = 0.0;
		for (int i = 0; i < K; i++) {
			sm += dd[i];
		}
		double mx = sm;

		for (int j = K; j < N; j++) {
			sm = sm + dd[j] - dd[j-K];
			if (sm > mx) mx = sm;
		}

		System.out.println(mx);
		
	}
}