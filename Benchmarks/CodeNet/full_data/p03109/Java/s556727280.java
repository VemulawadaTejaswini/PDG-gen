import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String h = "heisei";
		String t = "TBD";
		Calendar c =Calendar.getInstance();
		SimpleDateFormat f = new SimpleDateFormat("yyyy/mm/dd");
		if(f.parse(s).compareTo(f.parse("2019/04/30")) < 0) 
			System.out.println(t);
		else
			System.out.println(h);
	}
}