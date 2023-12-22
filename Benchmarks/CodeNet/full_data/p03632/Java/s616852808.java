import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int D = scanner.nextInt();
		int count = 0;

		//③④スイッチを押している時間がかぶらない時
		if (B < C || D < A) {
			count = 0;
		//①②スイッチを押している時間がどちらかに完全に含まれるとき
		} else if ((A <= C && B >= D) || (C <= A && D >= B)) {
			count = (B-A <= D-C) ? B-A : D-C;

		//⑤⑥スイッチを押している時間が一部かぶるとき
		} else {
			if (B == C || D == A) {
				count = 0;
			} else if (A < C) {
				count = Math.abs(C - B);
			} else {
				count = Math.abs(D - A);
			}
		}
		System.out.println(count);

	}

}