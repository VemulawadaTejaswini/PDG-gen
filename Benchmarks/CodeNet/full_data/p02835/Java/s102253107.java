import java.util.Scanner;
public class Main(){
  public static void main(String args[]){
       Scanner input = new Scanner(System.in);
        int A1 = input.nextInt();
        int A2 = input.nextInt();
        int A3 = input.nextInt();
         if(A1+A2+A3>=22){
             System.out.println("bust");
        
      }
         else{
             System.out.println("win");
         }
    }
}