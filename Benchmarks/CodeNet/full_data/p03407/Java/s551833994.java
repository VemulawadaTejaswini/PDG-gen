import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int a = 0;
		a += scanner.nextInt();
		a += scanner.nextInt();
		String s =(scanner.nextInt() <= a) ? "Yes" : "No" ;
		
		System.out.println(s);
	}
 
}