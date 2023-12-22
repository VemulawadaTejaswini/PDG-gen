import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[][] input = new int[N][2];
		int[] list = new int[100001];
		for (int i : list) {
			i = 0;
		}
		for (int i = 0; i < N; i++) {
			input[i][0] = sc.nextInt();
			input[i][1] = sc.nextInt();
			list[input[i][0]] += input[i][1];
		}
		int i = -1;
		while (K > 0) {
			i++;
			K -= list[i];
		}
		System.out.print(i);
	}

}
