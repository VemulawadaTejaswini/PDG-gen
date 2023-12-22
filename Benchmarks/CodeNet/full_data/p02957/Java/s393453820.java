import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long A = sc.nextLong(),B = sc.nextLong();
		double k = 0;
		k = (A+B)/2;

		if((A+B)%2==0) {
			System.out.println((int)k);
		}else {
			System.out.println("IMPOSSIBLE");
		}
	}
}
