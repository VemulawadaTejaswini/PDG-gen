import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
	
	static final private String DATE_FORMAT = "yyyy/MM/dd";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		LocalDate date = string2LocalDate(s);
		if(date.isAfter(LocalDate.of(2019, 4, 30))) {
			System.out.println("TBD");
		}else {
			System.out.println("Heisei");
		}
		
	}
	
	public static LocalDate string2LocalDate(final String date) {
		  return LocalDate.parse(date, DateTimeFormatter.ofPattern(DATE_FORMAT));
		}
}