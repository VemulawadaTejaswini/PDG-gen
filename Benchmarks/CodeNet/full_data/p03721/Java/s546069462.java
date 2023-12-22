import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] list = new int[100001];
		for (int i : list) {
			i = 0;
		}
		for (int i = 0; i < N; i++) {
			list[sc.nextInt()] += sc.nextInt();
		}
		int i = 0;
		while (K > 0) {
			i++;
			K -= list[i];
		}
		System.out.print(i);
	}

}
