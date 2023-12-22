import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Nの入力
		int N = sc.nextInt();
		
		// Biの入力
		ArrayList<Integer> b = new ArrayList<>();
		for (int i = 1; i <= N-1; i++) {
			b.add(sc.nextInt());
		}
		
		// Aiの作成
		ArrayList<Integer> a = new ArrayList<>();
		a.add(b.get(0));
		for (int i = 0; i < N-2; i++) {
			if (b.get(i) <= b.get(i+1)) {
				a.add(b.get(i));
			}
			else {
				a.add(b.get(i+1));
			}			
		}
		a.add(b.get(N-2));
		
		// Aiの要素を合計
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += a.get(i);
		}
		
		// 結果の出力
		System.out.println(sum);
		
		sc.close();
	}

}
