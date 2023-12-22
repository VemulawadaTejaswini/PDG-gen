import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		final int N = sc.nextInt();
    		final int[] X = new int[N];

    		double total = 0;
    		for (int i=0; i<N; i++) {
    			X[i] = sc.nextInt();
    			total += X[i];
    		}
    		double average = Math.round(total / N);
    		// System.out.println(average);

    		long totalCost = 0;
    		for (int i=0; i<N; i++) {
    			totalCost += (average - X[i]) * (average - X[i]);
    		}

    		System.out.println(totalCost);

    	} finally {
    		sc.close();
    	}
    }
}
