
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		int top = sc.nextInt();
		int under = sc.nextInt();
		int hight = sc.nextInt();
		
		System.out.println((top + under) * hight / 2);
	}
}
