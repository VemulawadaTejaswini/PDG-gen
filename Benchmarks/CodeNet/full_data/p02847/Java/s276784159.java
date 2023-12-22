import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<String> w = Arrays.asList("", "SAT", "FRI", "THU", "WED", "TUE", "MON", "SUN");

		System.out.println(w.indexOf(sc.next()));
	}
}