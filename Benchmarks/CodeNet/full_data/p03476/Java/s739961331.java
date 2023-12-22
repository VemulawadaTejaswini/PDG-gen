import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int[][] arr = new int[N][2];
		for (int i = 0; i < N; i++) {
			arr[i][0] = reader.nextInt();
			arr[i][1]  = reader.nextInt();

		}
		int[] pr = new int[100000];
		for (int j = 3; j <= 100000; j+=2) {
			pr[j] = pr[j-1];
			if (isPrime((j+1)/2) && isPrime(j)) {
				pr[j]++;
			}
			pr[j+1] = pr[j];
		}
		for (int i = 0; i < N; i++) {
			int ans = pr[arr[i][1]] - pr[Math.max(arr[i][0]-1, 0)];
			System.out.println(ans);
		}

		reader.close();

	}
	public static boolean isPrime(int num) {
		boolean result = true;
		if (num == 1) {
			return false;
		}
		if (num == 2) {
			return true;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				result = false;
			}
		}
		return result;
	}
}



