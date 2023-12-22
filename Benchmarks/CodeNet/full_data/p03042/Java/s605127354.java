import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
      String s = scan.next();
      int a = Integer.parseInt(s.substring(0,2));
       int b = Integer.parseInt(s.substring(2));
       if(a!=0 && a<=12) {
    	   if(b!=0 && b<=12) {
    		   System.out.println("AMBIGUOUS");
    	   }else {
    		   System.out.println("MMYY");
    	   }
       }else {
    	   if(b!=0 && b<=12) {
    		   System.out.println("YYMM");
    	   }else {
    		   System.out.println("NA");
    	   }
       }
	}
}