import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int ans = num1 * num2;
		if(num1 > 9 || num2 > 9) {
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}
		// Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}