import java.io.*;
import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
         int w=sc.nextInt();
         int h=sc.nextInt();
         String a[]=new String[w];
          for(int i=0;i<w;i++)
          {
              a[i]=sc.next();
          }
         
         for(int f=0;f<h+2;f++)
         {
             System.out.print("*");
             
         }
         System.out.println();
         for(int k=0;k<w;k++)
         {
             System.out.println("*"+a[k]+"*");
             
             
         }
        for(int f=0;f<h+2;f++)
         {
             System.out.print("*");
             
         } 
         
    }}