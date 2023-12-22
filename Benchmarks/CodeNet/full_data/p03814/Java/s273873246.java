import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int a =s.indexOf("A");
		int b=s.lastIndexOf("Z");
		System.out.println(b-a+1);

	}

}
