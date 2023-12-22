import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		for(int i = 0 ; i < 1000 ; i++) {
			x = x.replaceFirst("ST", "");
		}
		System.out.println(x.length());
	}
}
