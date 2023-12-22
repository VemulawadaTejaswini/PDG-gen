import java.util.Scanner;
public class Main{
   public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      int D = sc.nextInt();
      if(A >C){
         C = A;
      }else{
         A=C;
      }
      if(B >D){
         B=D;
      }else{
         D=B;
      }
      System.out.println(B-A);


   }  
}