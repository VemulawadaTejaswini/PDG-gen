import java.util.*;
import java.math.*;
import java.lang.*;
import java.io.*;
 
public class Main{
  public static void main(String args[]) throws IOException{
    Scanner s=new Scanner(System.in);
   
    int a=s.nextInt();
    int b=s.nextInt();
    
    int n=1;
    while((a-1)*(n-1)+a<=b){
    n++;
    }
    
    System.out.println(n-1);
  }
    
}