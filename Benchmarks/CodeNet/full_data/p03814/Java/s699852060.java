import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		int firstIndex = s.indexOf('A');
		int lastIndex = s.lastIndexOf('Z');

		int result = lastIndex - firstIndex +1;
		System.out.println(result);

	}

}
