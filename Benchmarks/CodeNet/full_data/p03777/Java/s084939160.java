import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		if(a.equals("H") && b.equals("H")) {
			System.out.println("H");

		}else if(a.equals("H")&& b.equals("D")) {
			System.out.println("D");
		}else if(a.equals("D")&& b.equals("H")) {
			System.out.println("D");
		}else {
			System.out.println("H");
		}
	}

}
