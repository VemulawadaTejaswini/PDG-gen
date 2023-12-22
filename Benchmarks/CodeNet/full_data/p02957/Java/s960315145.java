import java.util.*;
public class Main {
	public static void main(String[] args){

      int a = sc.nextInt();
      int b = sc.nextInt();
      int k;
      
      if(a == b){
        System.out.println("IMPOSSIBLE");
      }else if(a < b){
        // a-k<0, b-k>0
        k=(b+a)/2;
         System.out.println(k);
      }
        
	}
}