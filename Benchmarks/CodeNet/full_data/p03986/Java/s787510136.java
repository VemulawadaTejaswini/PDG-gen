import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String x = sc.next();
		while (x.contains("ST")) {
			x = x.replace("ST", "");
		}
		System.out.println(x.length());
	}
}
