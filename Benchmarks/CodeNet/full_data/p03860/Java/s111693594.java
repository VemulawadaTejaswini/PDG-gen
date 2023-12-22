
import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		System.out.println("コンテスト名を入力してください。");
		
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		String c = scan.next();
		
		System.out.println(a.charAt(0)+"" + b.charAt(0)+"" + c.charAt(0));
	}
 
}