import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong(),b = scan.nextLong();
		long x = scan.nextLong();
		long result = (b/x) - (a/x);
		if(a%x==0)result++;
		System.out.println(result);
	}

}