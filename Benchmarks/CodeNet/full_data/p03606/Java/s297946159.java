import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;
		for(int i = 0; i < N; i++) {
			int input1 = sc.nextInt();
			int input2 = sc.nextInt();
			ans += input2 - input1 + 1;
		}
		System.out.println(ans);

	}
}