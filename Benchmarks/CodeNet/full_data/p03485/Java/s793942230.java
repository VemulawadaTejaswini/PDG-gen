import java.util.Scanner;
 
public class Main {
  public static void main (String[] args){
  
   int N,reverse=0,remaind,tmp;
    
   int a,b,x;
  
   Scanner sc = new Scanner (System.in);
   a=sc.nextInt();
   b=sc.nextInt();
   
   x=a+b;
   if(x%2==1){
     x=x/2 + 1;
   }
   else{
     x=x/2;
   }
    
   System.out.println(x);
   
  }
}