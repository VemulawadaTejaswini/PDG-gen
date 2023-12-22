import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// A, Bの入力
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		// 結果の出力
		if (A < 10 && B < 10) {
			System.out.println(A * B);
		}
		else {
			System.out.println(-1);
		}
		
		sc.close();
	}

}
