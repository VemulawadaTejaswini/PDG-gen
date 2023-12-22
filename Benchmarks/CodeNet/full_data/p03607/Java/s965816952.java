import java.util.Scanner;
import static java.lang.System.out;
import java.util.ArrayList;
public class Main{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      boolean flag = true;
      ArrayList<Integer> arrays = new ArrayList<Integer>(N);
      StringBuilder answers = new StringBuilder();
      for(int i=0;i < N;i++){
         int target  = sc.nextInt();
            for(int j=0;j<arrays.size(); j++){
               if(target == arrays.get(j)){
                  arrays.remove(j);
                  flag = false;
                  break;
               }
            }
            if(flag){
               arrays.add(target);
            }
            flag = true;
         }
            out.println(arrays.size());
      }
      
   }