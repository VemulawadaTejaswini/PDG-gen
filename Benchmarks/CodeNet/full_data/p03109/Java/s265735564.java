import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
   	
        String Date = sc.next();
        String[] A = Date.split("/");
    	
        int B0 = Integer.parseInt(A[0]);
        int B1 = Integer.parseInt(A[1]);
        
        if(B0 < 2019) {
     		System.out.println("Heisei");
        }
        
        if(B0 == 2019) {
        	if(B1 <= 4) {
        		System.out.println("Heisei");
        	}
        	else {
        		System.out.println("TBD");
        	}       	
        }
        if(B0 > 2019) {
    		System.out.println("TBD");
        }
  	}
}