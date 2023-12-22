import java.io.*;
import java.util.*;
import java.math.BigDecimal;
 
public class Main {
  public static void main (String [] args) throws IOException {
       Scanner sc= new Scanner (System.in);
     int W= sc.nextInt();
     int H= sc.nextInt();
     int x= sc.nextInt();
     int y= sc.nextInt();
      BigDecimal half =  
               new BigDecimal((W*H)/2); 

    System.out.print(half);
    if(2*x==W && 2*y==H)System.out.print(" "+ 1);
    else System.out.print(" " +0);
 
  }
  
}