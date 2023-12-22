import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = nextInt();
        int[] d = new int[n];
        int[] dummy = new int[n];
        int max = 0;
        for(int i = 0; i < n; i++){
            d[i] = nextInt();
            if (max < d[i]) {
            	max = d[i];
            }
            dummy[d[i]] += 1;
        }

        boolean flag = true;
        BigDecimal Answer = new BigDecimal(1);

        if (d[0] != 0) {
        	flag = false;
        }
        for (int i = 1; i<n; i++) {
        	if (i <= max) {
        		if (dummy[i] == 0) {
        			flag = false;
        		}
        		Answer = Answer.multiply(BigDecimal.valueOf(Math.pow(dummy[i - 1 ], dummy[i])));
        	}
        }

        if (flag) {
        	println(Answer.remainder(new BigDecimal(998244353)));
        } else {
        	println(0);
        }
    }

    static int nextInt() {
        return Integer.parseInt(next());
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

}