import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		final int A = sc.nextInt();
    		final int B = sc.nextInt();

    		System.out.println(Math.max(A - B*2, 0));

    	} finally {
    		sc.close();
    	}
    }
}

