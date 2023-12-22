import java.util.*;
import java.util.InputMismatchException;
public class Main {
	public static void main(String[] args){
      try{
		Scanner sc = new Scanner(System.in);
      	
//      int a = Integer.parseInt(args[0]);
//      int a = Integer.parseInt(args[1]);

      
	      int a = sc.nextInt();
	      int b = sc.nextInt();
	      int k;
      
	      if(a == b){
 	  	     System.out.println("IMPOSSIBLE");
          }else if(a < 0){
            System.out.println("IMPOSSIBLE");
          }else if (b > 1000000000){
            System.out.println("IMPOSSIBLE");
	      }else{
	        k=(b+a)/2;
            if((k*2) != (a+b)){
              System.out.println("IMPOSSIBLE");
            }
			System.out.println(k);
	      } 
      }catch(InputMismatchException e){
        System.out.println("IMPOSSIBLE");
      }
	}
}
