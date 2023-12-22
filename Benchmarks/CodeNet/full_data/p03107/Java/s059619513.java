import java.util.Scanner;
import java.util.stream.Stream;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Stringをint配列に変換
		int[] S = Stream.of(sc.nextLine().split("")).mapToInt(Integer::parseInt).toArray();

		// 0の回数、1の回数を取得
		int zero_cnt=0;
		int one_cnt=0;
		for(int i=0;i<S.length;i++) {
			if(S[i]==0) zero_cnt++;
			else one_cnt++;
		}
		
		// 0or1で少ない方を取得
		// 回数の取得になる。
		int result = Math.min(zero_cnt, one_cnt);
		
		// 1回で2つ減るので×2をする。
		System.out.println(result*2);
	}
}