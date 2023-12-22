import java.util.Scanner;

// https://atcoder.jp/contests/abc154/tasks/abc154_d
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] array = new int[N];
		for(int i=0;i<N;i++) {
			array[i] = sc.nextInt();
		}
		sc.close();

		double ans = 0.0;

		for(int i=0;i<N-K+1;i++) {
			double flag1 = 0.0;
			for(int j=i;j<i+K;j++) {
				flag1 = flag1 + (array[j]+1)/2.0;
			}
			ans = Math.max(ans, flag1);
		}
		System.out.println(ans);

	}

}
