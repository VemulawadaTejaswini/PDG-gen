import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
    	Scanner s = new Scanner(System.in);
    	int n = s.nextInt(), m = s.nextInt();

    	System.out.println((long)Math.ceil(n*1.*m/2));
    	}
    }
