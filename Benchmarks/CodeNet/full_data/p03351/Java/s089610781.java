import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int ac = Math.abs(c-a);
		int ab=Math.abs(b-a);
		int bc = Math.abs(c-b);
		if(ac<=d) {
			System.out.println("Yes");
		}else if(ab<=d && bc<=d) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
