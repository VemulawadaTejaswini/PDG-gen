import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = new String(scanner.next());
		Integer output = input.indexOf('A') - input.lastIndexOf('Z');
		System.out.println(output);
		scanner.close();
	}
}