import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Sの入力
		String S = sc.next();
		
		// 結果の出力
		switch (S) {
		case "SAT":
			System.out.println(1);
			break;
		case "FRI":
			System.out.println(2);
			break;
		case "THU":
			System.out.println(3);
			break;
		case "WED":
			System.out.println(4);
			break;
		case "TUE":
			System.out.println(5);
			break;
		case "MON":
			System.out.println(6);
			break;
		case "SUN":
			System.out.println(7);
			break;
		}
		
		sc.close();
	}

}
