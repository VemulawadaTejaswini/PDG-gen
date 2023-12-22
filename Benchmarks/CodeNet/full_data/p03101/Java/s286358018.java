import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		sc.close();
		// 全部のマス目
		int goukei = H * W;
		// 塗りつぶす行数分のマス目を引く
		goukei -= (h * W);
		// 塗りつぶす列数分のマス目を引く
		// すでに塗りつぶした行分は引く
		goukei -= ((H - h) * w);
		// 出力
		prtln(goukei);
	}
	public static <T> void prtln(T t) { System.out.println(t); }
}