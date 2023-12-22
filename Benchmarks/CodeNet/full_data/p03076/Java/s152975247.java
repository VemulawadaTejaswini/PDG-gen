import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		// 5つの料理を格納する配列
		int dish[] = new int[5];

		// 料理を順番に格納
		for (int i = 0; i < 5; i++) {
			dish[i] = sc.nextInt();
		}
		int sum = 0;
		int max = 0;
      
		// 最後に注文した方がよさそうなものを求める
		for (int i = 0; i < 5; i++) {
			int d = (dish[i] + 9);
			d = d / 10 * 10;
			sum += d;
			max = Math.max(max, d - dish[i]);
		}
		System.out.println(sum - max);
	}
}