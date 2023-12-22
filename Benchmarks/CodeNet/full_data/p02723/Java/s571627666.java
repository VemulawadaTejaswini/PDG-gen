import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String S = sc.next();
	        char[] c = S.toCharArray();
	        
	        String ans="No";
	        if(c[2]==c[3]) {
	        	if(c[4]==c[5]) {
	        		ans="Yes";
	        	}
	        }
	        
        	System.out.println(ans);
	        	        
	 }
}
