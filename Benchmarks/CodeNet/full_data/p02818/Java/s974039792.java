import java.util.*;
 public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      int A = sc.nextInt();
      int B = sc.nextInt();
      int K = sc.nextInt();

      if(A >= K){
       System.out.print(A - K);
       System.out.print(B);

      }else if(A + B <= K){
       System.out.print(0);
       System.out.print(0);

      }else{
       System.out.print(0);
       System.out.print(B - (K - A));
      }
   }
 }