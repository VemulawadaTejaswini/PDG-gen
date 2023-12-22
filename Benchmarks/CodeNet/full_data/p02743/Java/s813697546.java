import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double a = sc.nextDouble();
	        double b = sc.nextDouble();
	        double c = sc.nextDouble();
	        
	        if(Math.pow(a,0.5)+Math.pow(b, 0.5)<Math.pow(c, 0.5)) {
	        	System.out.println("Yes");
	        } else {
	        	System.out.println("No");
	        }

	        
	 }
	 

}