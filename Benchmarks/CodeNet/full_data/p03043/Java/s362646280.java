import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
    	try (Scanner sc = new Scanner(System.in)) {
        	int n = sc.nextInt();
          	int k = sc.nextInt();
          	System.out.println(7 / (16 * n));
        }
    }
}