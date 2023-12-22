import java.util.*;
 
public class Main {
  
  public static void main(String[] args){
    
  Scanner s=new Scanner(System.in);
    
  Long S=s.nextLong();
  Long A=s.nextLong();
  Long B=s.nextLong();
  
  Long division=S/(A+B);
  Long remainder=S%(A+B);
  
  Long count;
    
  if(remainder<A) count=division*A+remainder;
  else count=division*A+A;
    
  System.out.print(count);
  }
}
