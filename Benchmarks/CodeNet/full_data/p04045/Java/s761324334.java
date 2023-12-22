import java.io.PrintWriter;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	static PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args) {
		// 入力
		final String n;		// 1≦N<10000
		final int k;	// 1≦K<10
		final int[] d;	// 0≦D1<D2<…<DK≦9  {D1,D2,…,DK}≠{1,2,3,4,5,6,7,8,9}
		try(Scanner scan = new Scanner(System.in)) {
			n = "0" + scan.next();				// 繰り上がり用に先頭に0を挿入。
			k = scan.nextInt();
			d = new int[k];
			for (int i = 0; i < k; i++) {
				d[i] = scan.nextInt();
			}
		}
		
		// 嫌いでない数字の配列  maxはlike[10 - k -1] minはlike[0]
		final int[] like = IntStream.range(0, 10).filter(i -> Arrays.stream(d).noneMatch(dd -> dd == i)).toArray();
		
		// 各位の数字の取得		上記よりvalue[0] = 0が挿入されている。
		final int[] original = n.chars().map(i -> i - (int) '0').toArray();
		int[] result = Arrays.copyOf(original, original.length);
		
		// 末尾の桁から処理する。最上位の桁は別処理。
		for (int j = result.length - 1; j > 0; j--) {
			final int i = j;
			
			OptionalInt tempInt = Arrays.stream(like).filter(likevalue -> likevalue >= result[i]).min();
			if (tempInt.isPresent()) {
				result[i] = tempInt.getAsInt();
			} else {
				result[i - 1]++;	// 繰り上がり処理
				result[0] = like[0];
			}		
		}
		
		// 一番上の桁はlikeに0がなくても0でもよい。
		if (result[0] == 0) {
			result[0] = 0;
		} else {		// result[0] ==1で {D1,D2,…,DK}≠{1,2,3,4,5,6,7,8,9}により値があることが保証されている。
			result[0] = Arrays.stream(like).filter(likevalue -> likevalue >= result[0]).min().getAsInt();
		}
		
		// 上の方で値が増えれていれば、そこから先は関係ない。
		for (int i = 0; i < result.length - 1; i++) {
			if (result[i] > original[i]) {
				Arrays.fill(result, i + 1, result.length, like[0]);
				break;
			}
		}
		//上の桁から処理するよりも処理量が多くなってしまった。

		//数値に戻して出力
		out.println(Arrays.stream(result).reduce((start, element) -> start * 10 + element).getAsInt());
		out.flush();
	}
}
