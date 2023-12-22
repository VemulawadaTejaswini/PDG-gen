import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		int B = sc.nextInt();
		sc.close();
		SimpleDateFormat sdf = new SimpleDateFormat("H");
        Date date = new Date();
        try {
        	date = sdf.parse(A);
        }catch(ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR, B);
        System.out.println(sdf.format(calendar.getTime()));
	}
}
