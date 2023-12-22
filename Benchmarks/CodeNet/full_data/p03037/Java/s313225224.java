import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());

		int[] L = new int[M];
		int[] R = new int[M];

		for(int i = 0 ; i < M ; i++) {
			L[i] = Integer.parseInt(sc.next());
			R[i] = Integer.parseInt(sc.next());
		}

		sc.close();

		//Logic
		int answerL = 0;
		int answerR = N;

		for(int i = 0; i < M ; i++) {
			answerL = Math.max(answerL, L[i]);
			answerR = Math.min(answerR, R[i]);
		}

		//Output
		System.out.println(answerR - answerL + 1);

	}

}
