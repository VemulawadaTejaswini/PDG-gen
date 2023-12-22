import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
    	Scanner s = new Scanner(System.in);
    	long a = s.nextLong(), b = s.nextLong(), c = s.nextLong();
    	long z = c - a - b;
    	long y = 4 * a * b;
    	if (z > 0 && z * z > y) {
    		System.out.println("Yes");
    	} else {
    		System.out.println("No");
    	}
    	}
    }
