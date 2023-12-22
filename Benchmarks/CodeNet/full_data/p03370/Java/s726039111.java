import java.util.*;

import sun.font.TrueTypeFont;

import static java.lang.System.out;

public class Main{
   public static Scanner sc = new Scanner(System.in);
   public static void main(String args[]){
      // String str = sc.next();
      // int i = str.split("x").length;
      // out.println(700 + i * 100);

      int N = sc.nextInt();
      int gram = sc.nextInt();
      int[] array = new int[N];
      int count = N; //個数
      int cost = 0; //容量
      for (int i = 0; i < N; i++) {
          array[i] = sc.nextInt();
      }
      Arrays.sort(array);
      for(int make : array) {
         cost += make;
      }
      int row = array[0];
      while (row + cost <= gram) {
         cost += row;
         count++;
      }

      out.println(count);


   }

}