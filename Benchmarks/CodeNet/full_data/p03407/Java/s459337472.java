import java.util.*;

class Main {
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);

      int A = scan.nextInt();
      int B = scan.nextInt();
      int C = scan.nextInt();

      if(A + B >= C){
         System.out.println("Yes");
         }
      else{
          System.out.println("No");
          }
   }
}
