import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var str = sc.next();
		sc.close();

		System.out.println(str.contains("7") ? "Yes" : "No");
	}
}