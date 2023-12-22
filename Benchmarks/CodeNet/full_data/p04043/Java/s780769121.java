import java.util.*;
import java.io.*;

public class Main{

     public static void main(String []args){
       Scanner scanner = new Scanner(System.in);
       int n1 = 0;
       int n2 = 0;
      
       
       for(int i=0;i<3;i++) 
       {
           int temp=scanner.nextInt();
           if(temp==5)
           n1++;
           else if(temp==7)
           n2++;
       }
       
       if(n1==2 && n2==1)
       System.out.println("YES");
       else System.out.println("NO");
       
       
     }
}