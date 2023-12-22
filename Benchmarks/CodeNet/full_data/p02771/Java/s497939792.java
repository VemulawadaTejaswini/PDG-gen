import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		final int A = sc.nextInt();
    		final int B = sc.nextInt();
    		final int C = sc.nextInt();

    		if (A == B) {
    			if (A == C) {
    				System.out.println("No");
    			} else {
    				System.out.println("Yes");
    			}
    		} else if (A == C || B == C) {
				System.out.println("Yes");
    		} else {
				System.out.println("No");
    		}

    	} finally {
    		sc.close();
    	}
    }
}
