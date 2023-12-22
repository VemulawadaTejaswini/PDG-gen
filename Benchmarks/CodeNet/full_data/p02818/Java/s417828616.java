import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		long k = scan.nextLong();

		if(k >= a) {
			a = 0;
			k -= a;
		}else {
			a -= k;
			k = 0;
		}

		if(k >= b) {
			b = 0;
		}else {
			b -= k;
		}

		System.out.println("" + a + " " + b);
	}
}