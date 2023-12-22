import java.util.*;
import static java.lang.System.out;
public class Main{
  static Scanner sc=new Scanner(System.in);
   static Scanner sct = new Scanner(System.in);
   public static void main(String[] args){
      int N = sc.nextInt();
      String[] st1  = sct.nextLine().split(" ");
      String[] st2  = sct.nextLine().split(" ");
      String[] st3  = sct.nextLine().split(" ");
      int[] array1 =castInt(st1,N);
      int[] array2 =castInt(st2,N);
      int[] array3 =castInt(st3,N);

      int count = 0;
      
      for(int i=0;i<N;i++){
         
         for(int j =0; j<3 ;++j){
            if(array3[i] > array2[j] ){
               for(int k=0; k<3; k++){
                  if(array2[j] > array1[k]){
                     count++;
                  }else{
                     break;
                  }
               }
            }
         }
      }
      out.println(count);
      
    
  } 
  static int[] castInt(String[] str,int N){
     int[] array = new int[N];
  for(int i=0;i<N;i++){
      array[i] = Integer.parseInt(str[i]);
  }     
  Arrays.sort(array); 
  return array;
  }
}