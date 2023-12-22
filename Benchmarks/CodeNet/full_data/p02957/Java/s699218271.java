import java.util.*;

public class Main{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  
  int a = sc.nextInt();
  int b = sc.nextInt();
  int K =0;
  boolean flag=true;
    
    for(K=0;K<2147483647;K++){
      
      int A = Math.abs(a-K);
      int B = Math.abs(b-K);
        
    if((A-B)==0){
    System.out.print(K);
      flag=false;
      break;
    }
    }
    if(flag)
      System.out.print("IMPOSSIBLE");
  }
}