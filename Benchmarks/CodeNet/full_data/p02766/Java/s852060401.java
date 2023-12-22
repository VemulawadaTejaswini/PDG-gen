import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		final int N = sc.nextInt();
    		final int K = sc.nextInt();

    		if (N == 0) {
    			System.out.println(1);
    		} else if (K == 1) {
    			System.out.println(N);
    		} else {
        		double value = Math.log(N+1) / Math.log(K);
        		System.out.println((int) Math.ceil(value));
    		}

    	} finally {
    		sc.close();
    	}
    }
}
