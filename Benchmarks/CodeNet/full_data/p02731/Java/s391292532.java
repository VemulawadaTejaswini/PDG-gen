import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long v = (long) Math.pow((n/3), 3);
		System.out.println(v);
	}
}