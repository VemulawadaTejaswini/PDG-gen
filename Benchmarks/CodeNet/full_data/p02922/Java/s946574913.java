import java.util.*;
import java.math.*;
import java.lang.*;
import java.io.*;
 
public class Main{
  public static void main(String args[]) throws IOException{
    Scanner s=new Scanner(System.in);
   
    double a=s.nextDouble();
    double b=s.nextDouble();
    
    System.out.println((int)Math.ceil(b/a));
  }
    
}