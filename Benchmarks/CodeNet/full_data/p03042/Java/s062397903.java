import java.sql.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String cnt = "20";
		String day = "01";

		Scanner sc1 = new Scanner(System.in);

		String s = sc1.next();

		String str1 = s.substring(0, 2);
		String str2 = s.substring(2, 4);

		//YYMM
		String date1 = cnt + str1 + "-" + str2 + "-" + day;
		//MMYY
		String date2 = cnt + str2 + "-" + str1 + "-" + day;

		//System.out.println(date1);
		//System.out.println(date2);

		boolean flg1 = true;
		boolean flg2 = true;

		try {
			Date.valueOf(date1);
		}
		catch(IllegalArgumentException e) {
			flg1 = false;
		}

		try {
			Date.valueOf(date2);
		}
		catch(IllegalArgumentException e) {
			flg2 = false;
		}

		if (flg1 && flg2) {
			System.out.println("AMBIGUOUS");
		}
		else if (flg1) {
			System.out.println("YYMM");
		}
		else if (flg2) {
			System.out.println("MMYY");
		}
		else {
			System.out.println("NA");
		}

		sc1.close();

	}

}