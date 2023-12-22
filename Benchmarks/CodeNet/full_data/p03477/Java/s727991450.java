import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();

		int l = a+b;
		int r = c+d;

		if(l>r) {
			System.out.println("Left");
		}else if(l<r) {
			System.out.println("Right");

	}else {
		System.out.println("Balanced");
	}
}
}
