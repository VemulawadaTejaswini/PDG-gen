import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static int[] ans;
//	 static int mod = 998244353;
   public static void main(String[] args) {
	          
	   Scanner sc = new Scanner(System.in);
       String  N = sc.next();
       String ans;
       if(N.equals("AAA")||N.equals("BBB")) {
    	   ans="No";
       } else {
    	   ans="Yes";
       }
       System.out.println(ans); 
       return;
   }

}