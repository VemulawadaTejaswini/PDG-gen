import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String line = null;
		try (Scanner sc = new Scanner(System.in)) {
			line = sc.nextLine();
			SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd");

			Date d1 = sd.parse(line);
			Date d2 = sd.parse("2019/04/30");

			String result = "Heisei";
			if (d1.compareTo(d2) > 0) {
				result = "TBD";
			}
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
