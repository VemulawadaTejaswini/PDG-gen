import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int K = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		/* ひとつの配列を揃えるためには、Nの中の連続したK個の中でも最小値が含まれているものを選んで
		 * 最初の操作の対象にすればよい。あとは場合分け。
		 * 試す。Nを(K-1)で割った結果に1を足せば答えになりそう。
		 * Aの中で重複するものは存在しないのでこれより低くはならないはず
		 * */
		int ans = N / (K-1) + 1;
		System.out.println(ans);
	}
}
