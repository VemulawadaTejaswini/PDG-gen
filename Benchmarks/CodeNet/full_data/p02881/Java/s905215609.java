import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        double n = nextInt();

        List<Double> list = primeFactorization(n);
        double size = list.size();

        if (size == 1) {
        	String answer = String.valueOf(n - 1);
        	println(answer);
        } else {
        	double a = list.get(0);
        	double b = list.get(1);

	        for (int i = 2; i < size; i++) {
	        	double dummy = list.get(i);
	        	if (a < b) {
	        		a = a * dummy;
	        	} else {
	        		b = b * dummy;
	        	}
	        }
	        String answer = String.valueOf((a - 1) + (b - 1));
        	println(answer);
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