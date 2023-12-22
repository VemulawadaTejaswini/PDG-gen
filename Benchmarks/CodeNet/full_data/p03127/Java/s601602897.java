import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// 初期化
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		// Streamを使用してint配列の作成
		int[] list = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int result=list[0];
		for(int i=1;i<list.length;i++) {
			// ユークリッドの互除法により算出
			result = GCD(result,list[i]);
		}
		System.out.println(result);
	}

	public static int GCD(int a,int b) {
		if(a == 0) {
			return b;
		}
		else {
			return GCD(b%a,a);
		}
	}
}