import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int sum = 0;

		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				for (int k = 1; k <= N; k++) {
					sum = sum + gcd(i, j, k);
				}
			}
		}

		System.out.println(sum);
	}

	public static final int gcd(final int... param) {
	    final int len = param.length;
	    int g = getCommonDivisor(param[0], param[1]);    //gcd(a, b) は以前作ったもの
	    for (int i = 1; i < len - 1; i++) {
	        g = getCommonDivisor(g, param[i + 1]);       //gcd(a, b) は以前作ったもの
	    }
	    return g;
	}

	private static int getCommonDivisor(int x, int y) {
        int biggerNum = Math.max(x, y);
        int smallerNum = Math.min(x, y);

        // 大きい方から小さい方を割った余を求める
        int surplus = biggerNum % smallerNum;

        // 割り切れていれば、それを返す
        if (surplus == 0) {
            return smallerNum;
        }
        // 割り切れなければ再帰的に自信を呼び出す
        surplus = getCommonDivisor(smallerNum, surplus);

        return surplus;
    }
}