import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		boolean bass = false;
		if(!S.substring(0, 1).equals( S.substring(1, 2))) bass = true;
		if(!S.substring(2, 3).equals(S.substring(1, 2))) bass = true;


		if(bass) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
