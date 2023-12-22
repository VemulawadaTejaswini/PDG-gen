import java.util.*;
 class Main{

     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        int n =scan.nextInt();
        
        
      	if(n==100){
          System.out.println((int)Math.pow(100,d)*(n+1));
        }
       else{
         System.out.println((int)Math.pow(100,d)*n);
       }
     }
}