import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char a=scan.next().charAt(0);
		char b=scan.next().charAt(0);
		char c=scan.next().charAt(0);
		scan.close();
		System.out.println(String.valueOf(a).toUpperCase()
				+String.valueOf(b).toUpperCase()
				+String.valueOf(c).toUpperCase());
	}
}