import java.util.Scanner;
import static java.lang.System.out;
import java.util.Arrays;
public class Main{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      boolean flag = true;
      int count = 0;
      int array[] = new int[N];  
      for(int i=0; i<N;i++){
         array[i] = sc.nextInt();

      }
      Arrays.sort(array);

      for(int i=0;i<N-1; i++){
         if(array[i] == array[i+1]){
            i +=1;
         }else{
            ++count;
         }
      }
      if(N%2 ==0){
      ++count;  
        }    out.println(count);
      }
      
   }