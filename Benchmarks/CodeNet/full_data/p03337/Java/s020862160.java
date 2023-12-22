import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 入力
		int a = sc.nextInt();
		int b = sc.nextInt();

		int max;
		max = Math.max(a+b, a-b);
		max = Math.max(max, a*b);

		// 出力
		System.out.println(max);
	}
}