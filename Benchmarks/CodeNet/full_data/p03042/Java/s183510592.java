import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
//       while(true) {
    	   String[] s = sc.next().split("");
    	   boolean YY = true;
    	   boolean MM = true;
    	   if(Integer.valueOf(s[0]+s[1]) > 12 || Integer.valueOf(s[0]+s[1]) == 0) {
    		   MM = false;
    	   }
    	   if(Integer.valueOf(s[2]+s[3]) > 12 || Integer.valueOf(s[2]+s[3]) == 0) {
    		  YY = false;
    	   }
    	   if(!YY && !MM) {
    		   System.out.print("NA");
    	   }
    	   if(YY && MM){
    		   System.out.println("AMBIGUOUS");
    	   }
    	   else if(YY) {
    		   System.out.println("YYMM");
    	   }
    	   else if(MM) {
    		   System.out.println("MMYY");
    	   }
    	   
//      }
    }
}