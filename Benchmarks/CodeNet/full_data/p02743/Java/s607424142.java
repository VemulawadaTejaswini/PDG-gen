import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        long a = sc.nextLong();
	        long b = sc.nextLong();
	        long c = sc.nextLong();
	        
	        long sahen = (long) (Math.pow(a,2)+Math.pow(b, 2)+Math.pow(c, 2));
	        long uhen = 2*(a*b+b*c+c*a);
	        	
	        
	        if(sahen>uhen) {
	        	System.out.println("Yes");
	        } else {
	        	System.out.println("No");
	        }

	        
	 }
	 

}