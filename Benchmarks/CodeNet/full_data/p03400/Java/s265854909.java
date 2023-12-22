import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 合宿参加人数
		int N = sc.nextInt();
		// 合宿実施日数
		int D = sc.nextInt();
		// 合宿終了後の残りチョコ
		int X = sc.nextInt();
		// 食べたチョコ
		int total = 0;
		for(int i = 0; i<N; i++) {
			int A = sc.nextInt();
			total += eat(A, D);
		}
		System.out.println(total + X);
	}

	public static int eat(int A, int D) {
		ArrayList<Integer> days = new ArrayList<Integer>();
		for(int i = 0; i < D; i++) {
			if(i * A + 1 <= D){ days.add(A); };
		}
		return days.size();
	}
}