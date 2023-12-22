import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int a = N / 15;
		
		int b = (N * 800) - (a * 200);

		System.out.println(b);
	}

}
