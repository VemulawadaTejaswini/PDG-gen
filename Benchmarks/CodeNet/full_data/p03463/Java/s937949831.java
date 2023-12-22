import java.util.*;
import static java.lang.System.out;
public class Main{
   static Scanner sc = new Scanner(System.in);
   public static void main(String[] args){
      int N = sc.nextInt();
      int A = sc.nextInt();
      int B = sc.nextInt();
      if(A == 1 && B-A == 1){
         System.out.println("Borys");
         return;
      }
      if(B-A-1%2 == 0){
         System.out.println("Alice");
      }else{
         System.out.println("Borys");
      }
   }
}