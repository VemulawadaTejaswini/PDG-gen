import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();

		long[] a = new long[5];
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}

		long x = N;
		long cnt = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < x) {
				cnt += x / a[i];
				x = a[i];
			}
		}

		System.out.println(cnt + 5);
	}

}
