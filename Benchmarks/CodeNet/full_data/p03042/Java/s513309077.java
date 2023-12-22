import java.util.*;
import java.math.*;
import java.lang.*;
import java.io.*;
 
public class Main{
  public static void main(String args[]) throws IOException{
    Scanner s=new Scanner(System.in);
   
    
    
    String ss=s.next();
    int f=Integer.parseInt(ss.substring(0,2));
    int se=Integer.parseInt(ss.substring(2,4));
    
    String res="";
    if(f<=12&&f>=1&&se<=12&&se>=1)
      res="AMBIGUOUS";
    else if(f==0||se==0)
      res="NA";
    else if(f>12&&se<=12&&se>=1)
      res="YYMM";
    else if(f<=12&&f>=1&&se>12)
      res="MMYY";
    
    System.out.println(res);
  }
}