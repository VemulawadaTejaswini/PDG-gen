import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		System.out.println(s.matches(".{2}(.)\\1{1}(.)\\2{1}") ? "Yes" : "No");
	}
}