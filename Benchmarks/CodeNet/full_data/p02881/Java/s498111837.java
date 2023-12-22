import java.util.Scanner;

// https://atcoder.jp/contests/abc144/tasks/abc144_c
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		double N = sc.nextDouble();
		sc.close();

		double ans = 1e+12;
		for (int i = 1; i <= N/2+1; i++) {
			if (N % i == 0) {
				double ans1 = i + N/i;
				if(ans1<ans) {
					ans = ans1;
				}
			}
		}
		System.out.println((int)ans-2);

		//		int[] array = new int[N];
		//		for(int i=0;i<N;i++) {
		//			array[i]=sc.nextInt();
		//		}
		//		sc.close();
	}
}