import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		int[] flag = new int[101];
		for(int i = 0; i < N; i++) {
			int d = sc.nextInt();
			flag[d] = 1;
		}

		for(int i = 1; i < 101; i++) {
			count += flag[i];
		}
		System.out.println(count);
	}
}