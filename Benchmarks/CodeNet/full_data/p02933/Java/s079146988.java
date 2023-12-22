import java.util.Scanner;

   class Red{
     public static void main(String[] args){
       Scanner stdIn = new Scanner(System.in)
       int A = stdIn.nextInt();
       String S = stdIn.next();
       if(A < 5000 && A >= 3200){
         System.out.println(S);
       }else if(A >= 2800 && A < 3200){
         System.out.println("red");
       }
     }
   }