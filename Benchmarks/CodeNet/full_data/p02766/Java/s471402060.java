import java.io.*;
import java.util.*;
public class Main{
   public static String baseConversion(String number, 
                                 int sBase, int dBase) 
    {
        return Integer.toString( 
            Integer.parseInt(number, sBase), 
            dBase); 
    } 
     public static void main(String []args){
       Scanner s=new Scanner(System.in);
       long n=s.nextLong();
       int k=s.nextInt();
       String c=String.valueOf(n);
       System.out.println(baseConversion(c,10,k).length());
     }}