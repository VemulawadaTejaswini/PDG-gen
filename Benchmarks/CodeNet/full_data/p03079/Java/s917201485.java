
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());//int型
		int b = Integer.parseInt(sc.next());//int型
		int c = Integer.parseInt(sc.next());
		sc.close();
		
		if (a == b && b == c) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
