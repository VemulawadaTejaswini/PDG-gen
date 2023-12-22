import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		String n = sc1.next();
		int intn = Integer.parseInt(n);
		int sn = 0;

		for (int i = 0 ; i < n.length() ; i++) {
			sn += Character.getNumericValue(n.charAt(i));
		}

		//System.out.println(sn);

		if ( intn % sn == 0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

		sc1.close();
	}
}