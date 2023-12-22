import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num_A = scan.nextInt();
		int num_B = scan.nextInt();
		int num_K = scan.nextInt();
		scan.close();
		
		int cnt = 0;
		while (cnt < num_K) {
//			操作回数の偶奇から髙橋君と青木君のどちらの操作なのか判断する
			if(cnt % 2 == 0) {
				if(num_A % 2 == 0) {
					num_A = Even(num_A);
				} else {
					num_A = Odd(num_A);
				}
				num_B = num_B + num_A;
			} else {
				if(num_B % 2 == 0) {
					num_B = Even(num_B);
				} else {
					num_B = Odd(num_B);
				}
				num_A = num_A + num_B;
			}
			cnt++;
		}
		
		System.out.println(num_A + " " + num_B);
		
	}
	
	// 入力値が偶数の場合
	public static int Even(int num) {
		int kai = num/2;	
		return kai;
	}
	
	// 入力値が奇数の場合
	public static int Odd(int num) {
		int kai = (num - 1) / 2;
		return kai;
	}
}
