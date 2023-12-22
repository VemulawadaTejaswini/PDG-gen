import java.util.*;
 public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      int A = sc.nextInt();
      int B = sc.nextInt();
      int K = sc.nextInt();

      if(A >= K){
        A -= K;
       

      }else if(A + B >= K){
        K -= A;
        A = 0;
        B -= K;
      

      }else{
        A = 0;B = 0;
       
      }
        System.out.println(A + " " + B);
   }
 }