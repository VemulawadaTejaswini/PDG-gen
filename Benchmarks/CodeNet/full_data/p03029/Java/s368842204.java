
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int P = sc.nextInt();
		int paiMax;
		P += A*3;
		paiMax = P/2;
		System.out.println(paiMax);
		sc.close();
	}
}