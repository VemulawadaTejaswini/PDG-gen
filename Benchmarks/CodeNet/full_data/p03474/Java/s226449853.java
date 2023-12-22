import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String S = sc.next();
      	Boolean ans1 = false;
		Boolean ans2 = false;
		
        if(S.charAt(A) == '-'){
            ans1 = true;
        }
        
        
      for (int i =0; i<A+B+1; i++){
          if(i != A){
            if(S.charAt(i)>='0' && S.charAt(i)<='9'){
            	ans2 = true;
          }
            else{
                ans2 = false;
                break;
            }
          } 
       }
      	
      if(ans1 == true && ans2 == true){
      System.out.println("Yes");
      }
      else{
       System.out.println("No");
      }
   }  	
}