import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long w = scan.nextLong();
		long h = scan.nextLong();

		long c = w%2==0 && h%2==0 ? (w*h)/2 : (w*h)/2+1;
		System.out.println(c);
	}

}