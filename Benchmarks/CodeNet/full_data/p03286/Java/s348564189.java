import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n == 0) {
			System.out.println("0"); // 解答を見た
		}
		System.out.println(calc(n));
	}
	public static String calc(int num) {
		if (num == 0) {
			return ""; // 桁数が尽きたら終了
		} else if (num%2 == 0) {
			// 割り切れる==このループが担当する桁には役割がない
			return calc(-num/2) + "0";
		} else {
//			return calc(-num/2) + "1"; 誤回答
			// 割り切れない==このループが担当する桁には役割がある
			return calc(-(num-1)/2) + "1"; //
		}
	}
}