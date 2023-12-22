import static java.lang.System.out;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
   public static void main(String[]aa){
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      StringBuilder sb = new StringBuilder();
      for(int i =0;i<n;i++){
         sb.append(sc.next());
         sb.reverse();
      }
      // ArrayList<Integer> array = new ArrayList<>();
      // for(int i=0;i<n;i++){
      //    array.add(sc.nextInt());
      //    Collections.reverse(array);
      // }
      int length = sb.length();
      for(int i=0;i<length; i++){
         out.print(sb.charAt(i) + " ");
      }
   }
}
