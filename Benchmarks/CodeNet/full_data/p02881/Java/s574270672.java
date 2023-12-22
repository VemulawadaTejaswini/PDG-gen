import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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

    public static List<Double> primeFactorization(double num) {
		List<Double> resultList = new ArrayList<Double>();
		double maxNum = Math.sqrt(num);

		double devideNum = 2;
		while (num % devideNum == 0) {
			resultList.add(devideNum);
	        num /= 2;
	    }

		devideNum = 3;
		while (num != 1 && devideNum < maxNum) {
			if (num % devideNum == 0) {
				resultList.add(devideNum);
				num /= devideNum;
			} else {
				devideNum +=2;
			}
		}

		resultList.add(num);

		return resultList;
	}

    public static BigDecimal test(double num) {
		double maxNum = Math.sqrt(num);
		BigDecimal max = new BigDecimal(maxNum);

		if (maxNum % 1 == 0) {
			return new BigDecimal(((maxNum) - 1) + (maxNum - 1));
		}

		int test = max.setScale(0, BigDecimal.ROUND_DOWN).intValue();

		if (num % test == 0) {
			return new BigDecimal(((num / test) - 1) + (test - 1));
		}

		int test2 = test;
		if (test % 2 == 0) {
			test2 = test - 1;
		}

		println(test2);

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