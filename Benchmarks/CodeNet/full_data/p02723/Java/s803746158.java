import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 読み込み
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		String c = "coffee";
		
		if(S.length() <6) {
	        System.out.println("No");
        }
		else if (c.substring(2,5).equals(S.substring(2, 5))) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}