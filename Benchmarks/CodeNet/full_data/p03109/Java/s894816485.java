import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		try {
			main.solve(sc);
		} catch (ParseException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		sc.close();
	}

	void solve(Scanner sc) throws ParseException {
		String S = sc.next();
		Date d = new SimpleDateFormat("yyyy/MM/dd").parse(S);
		if (d.after(new SimpleDateFormat("yyyy/MM/dd").parse("2019/05/01"))) {
			System.out.println("TBD");
		} else {
			System.out.println("Heisei");
		}
	}
}
