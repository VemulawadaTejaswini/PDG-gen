import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        double n = nextInt();

        println(test(n));
    }

    static long nextInt() {
        return Long.parseLong(next());
    }

    static String next() {
        return sc.next();
    }

    static String nextLine(){
        return sc.nextLine();
    }

    static void println(Object o) {
        out.println(o);
        out.flush();
    }

    public static BigDecimal test(double num) {
		double maxNum = Math.sqrt(num);
		BigDecimal max = new BigDecimal(maxNum);

		if (maxNum % 1 == 0) {
			return new BigDecimal(((maxNum) - 1) + (maxNum - 1));
		}

		int test = max.setScale(0, BigDecimal.ROUND_DOWN).intValue();

		int test2 = test;
		if (test % 2 == 0) {
			if (num % test == 0) {
				return new BigDecimal(((num / test) - 1) + (test - 1));
			}
			test2 = test - 1;
		}


		for (double i = test2; i > 1; i = i - 2) {
			if (num % i == 0) {
				return new BigDecimal(((num / i) - 1) + (i - 1));
			}
		}

		if (num % 2 == 0) {
			return new BigDecimal(num / 2);
		}

		return new BigDecimal(num - 1);
	}
}