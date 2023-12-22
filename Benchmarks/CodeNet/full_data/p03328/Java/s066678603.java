import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Receive number
    	Scanner sc = new Scanner(System.in);
    	int west = sc.nextInt();
    	int east = sc.nextInt();
    	double diff = east - west;

    	// calc
    	double ave = diff / 2;
    	int height = (int) (ave * (diff - 1));

    	// Display
    	System.out.print(height - west);
	}
}