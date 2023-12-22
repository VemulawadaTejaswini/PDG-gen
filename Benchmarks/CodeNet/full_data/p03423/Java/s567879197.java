import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力値を取得
		Integer n = sc.nextInt();
		Integer pair = n/3;
		System.out.println(pair);
	}
}