import java.util.*;
 
public class Main {
  
  public static void main(String[] args){
    
  Scanner s=new Scanner(System.in);
    
  int S=s.nextInt();
  int A=s.nextInt();
  int B=s.nextInt();
  
  int division=S/(A+B);
  int remainder=S%(A+B);
  
  int count=0;
    
  if(remainder<A) count=division*A+remainder;
  else count=division*A+A;
    
  System.out.print(count);
  }
}
