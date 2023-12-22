import java.util.*;
import java.math.*;
import java.lang.*;
import java.io.*;
 
public class Main{
  public static void main(String args[]) throws IOException{
    Scanner s=new Scanner(System.in);
   
    int n=s.nextInt();
   int k=s.nextInt();
    
    String ss=s.next();
    
    System.out.println(ss.substring(0,k-1)+(char)(ss.charAt(k-1)+32)+ss.substring(k));
  }
}