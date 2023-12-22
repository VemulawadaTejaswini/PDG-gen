//35分
import java.util.Arrays;
import java.util.Scanner;

public class Main {
//java11
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] n = new int[N];
		int[] a = new int[M];
		int[] b = new int[M];

		for(int i=0; i<N; i++) {
			n[i] = i+1;
		}

		for(int i=0; i<M; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}

		int ans = 0;
		//順列全探索
		for(int i=0; i<factorial(N-1); i++) {
			boolean flag = true;
			for(int j=0; j<N-1; j++) {
				boolean check = false;
				for(int k=0; k<M; k++) {
					if((n[j] == a[k] && n[j+1] == b[k]) || (n[j] == b[k] && n[j+1] == a[k])) {
						check = true;
						break;
					}
				}
				if(!check) {
					flag = false;
					break;
				}
			}

			if(flag)
				ans++;
			next_permutation(n, 1, n.length);
		}

		System.out.println(ans);
	}

	//階乗
	static int factorial(int n) {
		if(n == 1)
			return 1;

		return n * factorial(n-1);
	}

	//次の順列を生成する
	static boolean next_permutation(int[] array, int start, int end) {

		if(array == null || start > end || start < 0 || end > array.length) {
			System.out.println("Error: 引数が正しくありません。");
			return false;
		}

		for(int i=end-2; i>=start; i--) {
			if(array[i] < array[i+1]) {
				int j = end - 1;
				while(array[i] >= array[j]) {
					j--;
				}

				//swap
				int tmp = array[j];
				array[j] = array[i];
				array[i] = tmp;

				Arrays.sort(array, i+1, end);

				return true;
			}
		}

		return false;
	}

}
