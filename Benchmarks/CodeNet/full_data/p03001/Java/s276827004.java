import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long W = sc.nextLong();
		long H = sc.nextLong();
		long x = sc.nextLong();
		long y = sc.nextLong();
		sc.close();
		// 面積の小さい方の最大値＝長方形の半分の面積
		long maxHarfArea = (W * H) / 2;
		// xがWの半分の値であるか
		boolean xflg = x + x == W;
		// yがHの半分の値であるか
		boolean yflg = y + y == H;
		// 結果出力
		System.out.print(maxHarfArea + " ");
		// 半分のラインで分割できれば縦、横分割で複数
		System.out.println(xflg && yflg ? "1" : "0");
	}
}
