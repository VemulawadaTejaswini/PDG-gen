import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();//6/5
		System.out.println(2*(x/11)+(x%11 <= 6 ? 1 : 2));
	}
}