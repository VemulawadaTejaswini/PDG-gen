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
    //System.out.println(f+" "+se);
    String res="NA";
     if(f==0||se==0)
      res="NA";
      else{
    if(f>12&&se<=12)
      res="YYMM";
      else if(f>12&&se>12)
    res="NA";
    else if(f<=12&&se>12)
      res="MMYY";
    
    else if(f<=12&&se<=12)
    res="AMBIGUOUS";
      }
    System.out.println(res);
  }
}