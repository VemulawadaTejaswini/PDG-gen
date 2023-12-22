import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int A,B;
      A = sc.nextInt();
      B = sc.nextInt();
      int result = 0;
      if (A >= B){
      	result = result + A;
        A = A - 1;
      }
      else{
      	result = result + B;
        B = B - 1;
      }
            if (A >= B){
      	result = result + A;
        A = A - 1;
      }
      else{
      	result = result + B;
        B = B - 1;
      }
      System.out.println(result);
    }
}