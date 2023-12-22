import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Nの入力
		int N = sc.nextInt();
		
		// Nの桁数
		int digit = String.valueOf(N).length();
				
		// 結果の出力
		int count = 0;
		switch (digit) {
			case 1:
				count = N;
				break;
			case 2:
				count = 9;
				break;
			case 3:
				count = N - 90;
				break;
			case 4:
				count = 999 - 90;
				break;
			case 5:
				count = N - 90 - 9000;
				break;
			case 6:
				count = 99999 - 90 - 9000;
				break;
		}
		System.out.println(count);
		
		sc.close();
	}
}
