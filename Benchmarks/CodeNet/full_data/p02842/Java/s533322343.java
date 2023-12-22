import java.util.Scanner;
 

public class Main {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        double x = n / 108.0 * 100.0;
        boolean ret = (x%1) > 0.0;
        if (ret) {
        	System.out.println(":(");
        } else {
        	System.out.println((int)x);
        }

        sc.close();
	}
	
}
