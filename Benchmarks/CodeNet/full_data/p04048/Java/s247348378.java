import java.util.*;
import java.io.*;


public class Main{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
         int x = scanner.nextInt();
         int sum=0;
        
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