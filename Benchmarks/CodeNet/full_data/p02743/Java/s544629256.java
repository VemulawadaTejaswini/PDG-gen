import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	double A = sc.nextDouble();
    	double B = sc.nextDouble();
    	double C = sc.nextDouble();
    	if (Math.sqrt(A) + Math.sqrt(B) < Math.sqrt(C)) {
    		System.out.println("Yes");
    	} else {
    		System.out.println("No");
    	}
    }
}