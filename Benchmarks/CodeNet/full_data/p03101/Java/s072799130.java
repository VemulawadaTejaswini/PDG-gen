import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int h1 = sc.nextInt();
		int w1 = sc.nextInt();
		int h2= sc.nextInt();
		int w2 = sc.nextInt();

		int count = h1 * w1;
		int discount = h2 * w2 + (h1 - h2) * w2 + (w1- w2) * h2;

		System.out.println(count - discount);


	}

}
