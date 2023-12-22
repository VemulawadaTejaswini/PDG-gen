import java.util.*;
import static java.lang.System.out;

public class Main{
   public static Scanner sc = new Scanner(System.in);
   public static void main(String args[]){
    int A = sc.nextInt();
    int array[] = new int[A];
    boolean flag = false;
    for (int i = 0; i < A; i++) {
      array[i] = sc.nextInt();
    }
    for (int i: array) {
      if (i % 2 == 0) {
        flag = true;
      }
    }

    if (flag) {
      System.out.println(A);
    } else {
      System.out.println(0);
    }

   }
}