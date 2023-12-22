import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {

    	Scanner s = new Scanner(System.in);
    	int n = s.nextInt(), m = s.nextInt();
    	int r = n * (n - 1) /2 + m * (m - 1) /2;
    	System.out.println(r);
    	}
    

    }
