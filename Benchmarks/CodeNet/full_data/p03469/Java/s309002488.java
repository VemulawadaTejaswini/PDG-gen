import java.util.Scanner;
public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String input_str = sc.next();
		String before_fix = "2017";
		String after_fix = "2018";
		if(input_str.startsWith(before_fix)) {
			input_str = input_str.replaceFirst(before_fix,after_fix);
		};
		System.out.println(input_str);
	}
}
