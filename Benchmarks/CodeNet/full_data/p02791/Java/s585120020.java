import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(solve());
	}
	
	public static int solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] <= arr[i]) {
				sum++;
			}
		}
		return sum;
	}
}