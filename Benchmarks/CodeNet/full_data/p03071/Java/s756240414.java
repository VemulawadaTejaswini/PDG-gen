import java.util.*;
public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int A = sc.nextInt();
    int B = sc.nextInt();
    int sum =0;
 
    	if(A > B){
      	sum+= A;
          if(A > B){
          sum+=A;
          }else{
            sum+=B;
          }
      	}else{
      	sum+= B;
          if(A>B){
            sum+= A;
          }else{
            sum+= B;
    	}
    }
    System.out.println(sum);
  }
}