import java.util.*;
public class Main {
   static Scanner sc = new Scanner(System.in);

   public static void main(String[] args) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int[] array = {a,b,c};
      Arrays.sort(array);
      System.out.println(array[2] * 10 + array[1] + array[0]);
   }
}