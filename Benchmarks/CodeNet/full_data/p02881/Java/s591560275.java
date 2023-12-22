import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        long n = nextInt();

        List<Long> list = primeFactorization(n);
        long size = list.size();
        println(size);

        if (size == 1) {
        	println(n - 1);
        } else {
	        long a = list.get(0);
	        long b = list.get(1);

	        for (int i = 2; i < size; i++) {
	        	long dummy = list.get(i);
	        	if (a < b) {
	        		a = a * dummy;
	        	} else {
	        		b = b * dummy;
	        	}
	        }
	        println((a - 1) + (b - 1));
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

    public static List<Long> primeFactorization(long num) {
		List<Long> resultList = new ArrayList<Long>();

		long devideNum = 2;
		while (num % devideNum == 0) {
			resultList.add(devideNum);
	        num /= 2;
	    }

		devideNum = 3;
		while (num != 1) {
			if (num % devideNum == 0) {
				resultList.add(devideNum);
				num /= devideNum;
			} else {
				devideNum +=2;
			}
		}

		return resultList;
	}
}