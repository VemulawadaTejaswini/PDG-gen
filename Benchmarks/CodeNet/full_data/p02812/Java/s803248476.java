import java.util.*;
class Main {
 	public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
      	int n = s.nextInt();
      	String str = s.next();
      	System.out.println(func(str));
    } 
  
  	public static int func(String str) {
    	if (str.length() <= 2) {
        	return 0;
        }
      
      	if (str.charAt(0) == 'A' && str.charAt(1) == 'B' && str.charAt(2) == 'C' ) {
        	return 1 + func(str.substring(3));
        }
      
      	return func(str.substring(1));
    }
}