import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("SUN","MON","TUE","WED","THU","FRI","SAT");
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		System.out.println(7-list.indexOf(in));
	}
}
