import java.util.*;
public class Main {
    public static void main(String[] args) {
    	Scanner in=new Scanner(System.in);
        int A=in.nextInt();
        int B=in.nextInt();
        int C=in.nextInt();
    	if((1<=A&&A<=5)&& (1<=B&&B<=7)&& (1<=C&&C<=5))
        	System.out.println("Yes");        
      	else
         System.out.println("No"); 
   
    }
}