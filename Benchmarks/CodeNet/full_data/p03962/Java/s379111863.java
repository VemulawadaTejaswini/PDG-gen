import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		if(a==b && b==c) {
			System.out.println(1);
		}else if(a!=b && b!=c) {
			System.out.println(3);
		}else {
			System.out.println(2);
		}
	}

}
