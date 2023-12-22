import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();

		sc.close();

		if(c-(a+b) < 0) {
			out.println("No");
			return;
		}
		
		if (4*a*b < (c-(a+b))*(c-(a+b))) {
			out.println("Yes");
		} else {
			out.println("No");

		}

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
