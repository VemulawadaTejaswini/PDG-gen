import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
    	Scanner s = new Scanner(System.in);
    	long n = s.nextLong(), m = s.nextLong(), g = s.nextLong();
    	if (2 * Math.sqrt(n*m) + n + m < g) {
    		System.out.println("Yes");
    	} else {
    		System.out.println("No");
    	}
    	}
    }
