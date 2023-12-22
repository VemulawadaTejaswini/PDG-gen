import java.util.*;
import java.io.*;


public class Main{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        long n = (long)scanner.nextInt();
         long x = (long)scanner.nextInt();
         long sum=0;
        
        sum=sum+3*x;
        sum=sum+n-x;
        sum=sum+3*(n-(2*x));
        
        
      
        System.out.println(sum);
        //for(int i=0;i<n;i++);
        //int n = scanner.nextInt();
        //String n = scanner.next();
        //System.out.println("");
     }
}