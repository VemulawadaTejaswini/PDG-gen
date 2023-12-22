import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); //夏休みの日数
		int M = sc.nextInt(); //宿題の数

		int A[] = new int[M];//宿題にかかる日数
		int sum = 0; //宿題にかかる日数の合計
		int result = 0; //遊べる日数

		for(int i=0; i<M; i++) {

			A[i] = sc.nextInt();

			sum += A[i];
		}

		result = N - sum;
		if(result < 0) {
			result = -1;
		}

		System.out.print(result);
	}

}
