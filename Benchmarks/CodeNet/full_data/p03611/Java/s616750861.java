import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int ans = 0;
		int X = 0;
		int min = 100000;
		int max = 0;
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = reader.nextInt();
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
		}
		for (int i = min; i <= max; i++) {
			int tmp = 0;
			for (int l = 0; l < N; l++) {
				if (Math.abs(arr[l] - i) < 2) {
					tmp++;
				}
			}
			ans = Math.max(tmp, ans);
		}



		System.out.println(ans);
		reader.close();

	}
}



