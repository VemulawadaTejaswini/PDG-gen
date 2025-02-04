import java.io.PrintWriter;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	static PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args) {
		// 入力
		String n;		// 1≦N<10000
		final int k;	// 1≦K<10
		final int[] d;	// 0≦D1<D2<…<DK≦9  {D1,D2,…,DK}≠{1,2,3,4,5,6,7,8,9}
		try(Scanner scan = new Scanner(System.in)) {
			n = scan.next();
			k = scan.nextInt();
			d = new int[k];
			for (int i = 0; i < k; i++) {
				d[i] = scan.nextInt();
			}
			
		}
		
		// 嫌いでない数字の配列
		final int[] like = IntStream.range(0, 10).filter(i -> !Arrays.stream(d).anyMatch(dd -> dd == i)).toArray();
		// maxはlike[10 - k -1] minはlike[0]
		
		
		// 各位の数字
		final int[] value = new int[4];		//1≦N<10000より4桁
		
		for (int i = 0; n.length() < 4; i++) {
			n = "0" + n;
		}
		for (int i = 0; i < 4; i++) {
			value[i] = Integer.parseInt(n.substring(i, i + 1));
		}
		
		int[] result = new int[5];
		boolean top = false;	//最初の桁が現れればtrue
		boolean big = false;	//大きいことが確定すればtrue
		
		result[0] = 0;
		for (int j = 0; j < 4; j++) {
			final int i = j;
			//System.out.println(value[i]);
			if (!top && value[i] ==0) {
				result[i + 1] = 0;
				continue;
			} else {
				top = true;
			}

			if (big) {
				result[i + 1] = like[0];
			} else {
				OptionalInt temp = Arrays.stream(like).filter(likevalue -> likevalue >= value[i]).min();
				
				if (temp.isPresent()) {
					result[i + 1] = temp.getAsInt();
					big = value[i] < result[i + 1];
				} else {// value[i] > likeMax
					moveUp(result, like, i);
					big = true;
				}
			}
						
		}

		
		//数値に戻す
		// 出力
		out.println(Arrays.stream(result).reduce((start, element) -> start * 10 + element).getAsInt());
		out.flush();
	}
	
	/** 繰り上がり */
	static void moveUp(int[] result, int[] like, int i) {
		OptionalInt temp = Arrays.stream(like).filter(likevalue -> likevalue > result[i]).min();
		result[i+1] = like[0];
		if (temp.isPresent()) {
			result[i] = temp.getAsInt();		// i == 0でlike[0]==0 ? like[1] : like[0]になる
		} else {
			moveUp(result, like, i -1);
		}
	}
	
}
