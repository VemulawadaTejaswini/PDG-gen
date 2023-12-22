import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long a = scan.nextLong();
		long b = scan.nextLong();
		scan.close();
		if((b-a)%2==0)System.out.println((b-a)/2);
		else {
			System.out.println((n-a>b-1)? b-1:n-a);
		}

	}

}
