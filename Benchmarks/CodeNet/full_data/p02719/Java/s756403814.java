import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long n = scan.nextLong();
		long k = scan.nextLong();
		long min = n%k;
		long a = k-min;

		if(min > a) {
			min =a;
		}

		System.out.println(min);
		scan.close();
	}

}
