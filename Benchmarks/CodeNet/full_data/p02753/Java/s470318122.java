import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String eki = sc.next();
		System.out.print(eki.contains("AAA") || eki.contains("BBB") ? "No" : "Yes");
	}
}
