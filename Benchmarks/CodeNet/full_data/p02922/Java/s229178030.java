import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		final int A = sc.nextInt();
    		final int B = sc.nextInt();

    		int kuchi = 1;
    		for (int i=1; i<=B; i++) {
    			kuchi = kuchi - 1 + A;
    			if (kuchi>=B) {
    				System.out.println(i);
    				System.exit(0);
    			}
    		}

    	} finally {
    		sc.close();
    	}
    }
}

