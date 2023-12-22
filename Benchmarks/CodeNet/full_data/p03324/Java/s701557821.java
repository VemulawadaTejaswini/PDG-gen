import java.util.*;
import static java.lang.System.out;

public class Main{
   public static Scanner sc = new Scanner(System.in);
   public static void main(String args[]){
    int A = sc.nextInt();
    int B = sc.nextInt();
    int num = 100;
    if (A == 0) {
      System.out.println(B);
    } else if(A == 1) {
      System.out.println(B * num);
    } else {
      System.out.println(B * num * num);
    }
   }
}