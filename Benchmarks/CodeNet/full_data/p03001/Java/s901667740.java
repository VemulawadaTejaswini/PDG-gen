import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long W = sc.nextLong();
		long H = sc.nextLong();
		long x = sc.nextLong();
		long y = sc.nextLong();
		sc.close();
		// 縦に分割したときの面積の小さい方
		long area1 = Math.min(x * H, (W - x) * H);
		// 横分割したときの面積の小さい方
		long area2 = Math.min(W * y, W * (H - y));
		// 面積の小さい方の最大値
		long max = Math.max(area1, area2);
		System.out.print(max + " ");
		// 分割方法
		System.out.println(area1 == area2 && max > 0 ? "1" : "0");
	}
}
