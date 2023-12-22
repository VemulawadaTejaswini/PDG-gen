import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();
		long x = in.nextLong();
		in.close();

		long count = b/x-a/x;

		if(a%2==0) {
			count++;
		}
		System.out.println(count);
	}
}
