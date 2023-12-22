import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();

		if(Math.sqrt(a) + Math.sqrt(b) < Math.sqrt(c)) {
			System.out.print("Yes");
		} else {
			System.out.println("No");
		}
	}

}
