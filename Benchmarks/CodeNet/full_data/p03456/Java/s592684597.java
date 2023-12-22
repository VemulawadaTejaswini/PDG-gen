import java.util.*;

public class Main {
	
	
    public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in);
			
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = Integer.valueOf(String.valueOf(a) + String.valueOf(b));
	
	if (isPerfectSquare((double)c)) {
            System.out.print("Yes");
       } else{
            System.out.print("No");
    }
	
	
	}
	
	static boolean isPerfectSquare(double x) 
    {
         
        // Find floating point value of
        // square root of x.
        double sr = Math.sqrt(x);
     
        // If square root is an integer
        return ((sr - Math.floor(sr)) == 0);
    }
	
}