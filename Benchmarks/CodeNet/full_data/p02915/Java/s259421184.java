import java.util.Scanner;

public class Main{
 
 public static void main(String[] args){
     
     Scanner in=new Scanner(System.in);
     
     long n=in.nextInt();
     
     if(1<=n&&n<=9){
     if(n!=1){
         long k=2*n*n;
     System.out.println(k);
     }
     if(n==1){
         System.out.println("1");
     }
     
     }
 }
 
    
}
