import java.util.*;
import static java.lang.System.out;
public class Main{
   
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);

      int N = sc.nextInt();
      int[] array1 =new int[N];
      int[] array2 =new int[N];
      int[] array3 =new int[N];
      for(int i=0;i<N;i++){
         array1[i] = sc.nextInt();
      }
      for(int i=0;i<N;i++){
         array2[i] = sc.nextInt();
      }
      for(int i=0;i<N;i++){
         array3[i] = sc.nextInt();
      }
      Arrays.sort(array1);
      Arrays.sort(array2);
      Arrays.sort(array3);

      int count = 0; //ふつう
      //獲得
      int j = 0;
      int save = 0;
      for(int i=0;i<N;i++){
            int result = 0;
         for(; j<N ;++j){
            if(array3[i] > array2[j] ){
               for(int k=0; k<N; k++){
                  if(array2[j] > array1[k]){
                     result++;
                  }else{
                     break;
                  }
               }
            }else{
               break;
            }
         }
         if(result ==0){

         }else{
            save += result;
         }
         count += save;
         result = 0;
      }
      out.println(count);
    
    
  } 
//   static int[] castInt(String[] str,int N){
//      int[] array = new int[N];
//   for(int i=0;i<N;i++){
//       array[i] = Integer.parseInt(str[i]);
//   }     
//   Arrays.sort(array); 
//   return array;
//   }
}