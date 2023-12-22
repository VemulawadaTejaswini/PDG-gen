import java.util.*;
public class Main2{
     public static void main(String [] args){
          Scanner sc=new Scanner(System.in);
          int a=sc.nextInt();
          int b=sc.nextInt();
          int c=sc.nextInt();
          int z=Findmax(a,b,c);
          System.out.println(z);
          
     }
     public static int Findmax(int a, int b, int c){
          
          if(a>=b&&a>=c){
               return a*10+b+c;}
          else if(b>=a&&b>=c){
               return b*10+c+a;}
          else if(c>=a&&c>=b){
               return c*10+b+a;}
          return 0;
     }
     
}