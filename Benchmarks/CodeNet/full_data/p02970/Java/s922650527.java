import java.util.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		double ans = (double)N / (2 * D + 1);
		ans = Math.ceil(ans);
		System.out.println((int)ans);
		sc.close();
	}

}

