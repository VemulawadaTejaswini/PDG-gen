import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int p=a+b;
		int m=a-b;
		int k=a*b;
		int A=Math.max( p, m);
		int B=Math.max(A, k);
		System.out.println(B);
	}
}
