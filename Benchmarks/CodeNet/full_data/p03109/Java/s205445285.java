import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String s = scanner.next();
			scanner.nextLine();
			DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
			LocalDate date = LocalDate.parse(s, dateTimeFormatter);
			LocalDate date0430 = LocalDate.of(2019, 4, 30);
			if (date.isAfter(date0430)) {
				System.out.println("TBD");
			} else {
				System.out.println("Heisei");
			}
		}
	}
}
