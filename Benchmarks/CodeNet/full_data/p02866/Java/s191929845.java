import java.util.Scanner;

//第二回全国統一プログラミング王決定戦予選
//B Counting of Trees
public class Main {
	static final int DIV = 998244353;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] arrD = new int[N];
		int[] countD = new int[N];
		int maxD = 0;
		for (int i = 0; i < N; i++) {
			arrD[i] = Integer.parseInt(sc.next());
			countD[arrD[i]]++;
			maxD = Math.max(maxD, arrD[i]);
			if (i == 0 && arrD[i] != 0) {
				System.out.println(0);
				sc.close();
				return;
			}
			if (i != 0 && arrD[i] == 0) {
				System.out.println(0);
				sc.close();
				return;
			}

		}
		sc.close();

		for (int i = 1; i < maxD; i++) {
			if (countD[i] == 0) {
				System.out.println(0);
				return;
			}
		}

		long ans = arrD[1];
		for (int i = 2; i < N; i++) {
			ans *= arrD[i];
			ans %= DIV;
		}
		System.out.println(ans);
	}
}
