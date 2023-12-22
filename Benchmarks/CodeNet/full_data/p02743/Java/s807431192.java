import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	long A = sc.nextLong();
    	long B = sc.nextLong();
    	long C = sc.nextLong();
    	if (0 < C-A-B && 4*A*B < Math.pow(C-A-B, 2)) {
    		System.out.println("Yes");
    	} else {
    		System.out.println("No");
    	}
    }
}