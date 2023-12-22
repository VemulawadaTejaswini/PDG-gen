import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(a<b && a!=1 && b!=1) {
			System.out.println("Bob");

		}else if(a>b && a!=1 && b!=1) {
			System.out.println("Alice");
		}else if(a==1 && b!=1) {
			System.out.println("Alice");
		}else if(b==1 && a!=1) {
			System.out.println("Bob");
		}else if(a==b) {
			System.out.println("Draw");
		}
	}

}
