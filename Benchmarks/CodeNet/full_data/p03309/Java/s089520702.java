import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {

			int n = Integer.parseInt(br.readLine());
			String[] str = br.readLine().split(" ");
			int[] a = new int[n];
			// 最小値になるためのbの取り方は、Aから現在の(i+1)を除く部分の平均では？
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(str[i]);
			}
			// 解答＞ソートして中央値を求める
			int b[] = new int[n];
			for (int i = 0; i < n; i++) {
				b[i] = a[i] - (i + 1);
			}
			int c[] = b.clone();
			bubbleSort(c);
			int median = 0;
			if (n % 2 == 0) {
				median = (c[n / 2] + c[(n / 2) - 1]) / 2;
			} else {
				median = c[n / 2];
			}
			int total = 0;
			for(int i=0;i<n;i++) {
				total += Math.abs(b[i]-median);
			}
			System.out.println(total);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void bubbleSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = a.length - 1; j >= i + 1; j--) {
				// 前の数の方が大きかったら入れ替え
				if (a[j] < a[j - 1]) {
					int tmp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = tmp;
				}
			}
		}
	}
}