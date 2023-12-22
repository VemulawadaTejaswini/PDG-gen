import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int a_index = s.indexOf('A');
		int z_index = s.lastIndexOf('Z');

		System.out.println(z_index - a_index + 1);
	}
}