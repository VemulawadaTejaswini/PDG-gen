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

        List<Double> list = primeFactorization(n);
        int size = list.size();

        if (size == 1) {
        	BigDecimal test = new BigDecimal(n - 1);
        	println(test.setScale(0));
        } else {
        	double a = list.get(size - 1);
        	double b = list.get(size - 2);

	        for (int i = size - 3; i >= 0; i--) {
	        	double dummy = list.get(i);
	        	if (a < b) {
	        		a = a * dummy;
	        	} else {
	        		b = b * dummy;
	        	}
	        }
	        BigDecimal test = new BigDecimal((a - 1) + (b - 1));
        	println(test.setScale(0));
        }
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
}