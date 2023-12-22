import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		Scanner scanner = new Scanner(System.in);
		String S = scanner.next();

		 if (S.charAt(2) == S.charAt(3) && S.charAt(4) == S.charAt(5)  ){
			 System.out.println("Yes");
		 }else {
			 System.out.println("No");
		}

		scanner.close();
	}
}
