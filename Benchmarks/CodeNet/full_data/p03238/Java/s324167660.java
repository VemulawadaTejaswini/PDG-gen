import java.util.*;
public class Main {
   static Scanner sc = new Scanner(System.in);
   static Scanner sc2 = new Scanner(System.in);
   public static void main(String[] args) {
      int N = sc.nextInt();
      if (N == 1) {
         System.out.println("Hello World");
      } else {
         int A = sc.nextInt();
         int B = sc.nextInt();
         System.out.println(A + B);
      }

   }

   public static void swap (int[] array, int i, int j) {
      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;
   }

}