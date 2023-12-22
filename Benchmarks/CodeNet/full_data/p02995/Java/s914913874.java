import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] temp = scanner.nextLine().split(" ");
		long a = Long.parseLong(temp[0]);
		long b = Long.parseLong(temp[1]);
		long c = Long.parseLong(temp[2]);
		long d = Long.parseLong(temp[3]);

		a -= 1;

		double minusAC = Math.floor(a / c);
		double minusAD = Math.floor(a / d);
		long x = (c * d)/gcd(c, d);
		double minusACD = Math.floor(a / x);
		double minusBC = Math.floor(b / c);
		double minusBD = Math.floor(b / d);
		double minusBCD = Math.floor(b / x);

		long bminus = (long)(minusBC + minusBD - minusBCD);
		long aminus = (long)(minusAC + minusAD - minusACD);


		 long ans = (long)(b - a - (bminus - aminus));
		 System.out.println(ans);
	}


	public static long gcd(long a, long b) {

		if(a % b == 0) {
			return b;
		}

		return gcd(b, a % b);

	}

}