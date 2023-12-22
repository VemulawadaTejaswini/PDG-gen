import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextString();
		String y = sc.nextString();
		String z = sc.nextString();
		System.out.println(x.charAt(0) + y.charAt(1) + z.charAt(3));
	}
}