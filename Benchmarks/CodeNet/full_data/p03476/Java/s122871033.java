import java.util.*;
import static java.lang.System.out;
public class Main{
   static Scanner sc = new Scanner(System.in);
   public static void main(String[] args){
      int N = sc.nextInt();
      int[] r = new int[N];
      int[] l = new int[N];
      for(int i=0;i<N;i++){
         r[i] = sc.nextInt();
         l[i] = sc.nextInt();
      }
      int[] answer = new int[N];
      for(int i=0;i<N;i++){
         
         int min = r[i];
         int max = l[i];
         int length = max-min+1;
         for(int j =0; j<length;min++){
            if(min == 2017){
               answer[i]++;
               break;
            }
            if(min %2 == 0 && min <=5){
               answer[i]++;
            }
         }
      }
      for(int i :answer){
         System.out.println(i);
      }

   }
}