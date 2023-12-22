import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);

		String s=sc.next();
		
		System.out.println(s.replaceAll("[a-z]", "x"));
	}
}