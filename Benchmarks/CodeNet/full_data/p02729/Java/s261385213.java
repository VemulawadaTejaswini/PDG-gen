import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int numN = N * (N - 1) / 2;
		int numM = M * (M - 1) / 2;

		int sum = numN + numM;

		System.out.println(sum);

		sc.close();

	}

}
