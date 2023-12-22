import static java.lang.System.out;
import java.util.Scanner;
import java.util.Arrays;

public class Main{
   static Scanner sc = new Scanner(System.in);
   public static void main(String[] args){
      int N = sc.nextInt();
      if(N==0){
         System.out.println(N);
         return;
      }

      int[] array = new int[N];
      for(int i=0; i<N;i++){
         array[i] = sc.nextInt();
      }
      
      Arrays.sort(array);

      int result = 0;
      int count = 0;
      int old = 0;
      
      for(int i=0;i<N;i++){
         int target = array[i];
         if(target>N){
            result += N-i + count;
            count = 0;
            break;
         }
         
         if(old == target){
            count++;

         }else{
            if(old >count){
               result+= count;
            }else{
               result+= count-old;
            }
            old = target;
            count = 1;
         }

      }
      if(old < count){
         result += count-old;
      }
      if(old > count){
         result += count;
      }

      System.out.println(result);
   }
}
