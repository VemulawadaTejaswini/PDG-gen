import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		long k = sc.nextLong();

		if (a > 0) {
			long temp = a;
			if (k > a) a = 0;
			else a -= k;
			k -= temp;
		}
		if (b > 0 && k > 0) {
			b -= k;
		}

		System.out.println(a + " " + b);
	}
}