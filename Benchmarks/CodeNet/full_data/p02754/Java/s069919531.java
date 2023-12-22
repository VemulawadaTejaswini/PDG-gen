import java.io.*;
import java.util.*;
import java.util.ArrayList;
 
class Main
{
  public static void main (String[] arg)
  {
    Scanner scan = new Scanner(System.in);
    
    long N = Integer.parseInt(scan.next()); //整数    
    long A = Integer.parseInt(scan.next()); //整数    蒼
    long B = Integer.parseInt(scan.next()); //整数　　赤
    
    long ans = 0;
    
    if(B == 0){
      System.out.println(0);
    }
    
    else{
      
      ans = (N / (A + B)) * A;
      
      if((N % (A + B)) >= A){
        ans = ans + A;
      }
      else{
        
        ans = ans + N % (A + B);
      }
      System.out.println(ans);
    }
  }
}
