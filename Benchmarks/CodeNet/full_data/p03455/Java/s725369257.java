import java.util.Scanner;

// 提出時にclass Main に書き換え
public class Main {
	public static void main(String[] args)  {
		// 標準入力を受け取る
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // int aを受け取る
		int b = sc.nextInt(); // int aを受け取る
		sc.close(); // 標準入力を終了

		if ((a * b) % 2 == 0) {
			// 偶数
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

}