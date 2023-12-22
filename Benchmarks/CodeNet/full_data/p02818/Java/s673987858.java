import java.util.*;
 public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      int A = sc.nextInt();
      int B = sc.nextInt();
      int K = sc.nextInt();

      if(K <= A){
       System.out.println(A - K + " " + B);

      }else if(K < A + B){
        int C = B - (K - A);
       System.out.println(0 + " " + C);

      }else{
        
       System.out.println(0 + " " + 0);

      }
   }
 }