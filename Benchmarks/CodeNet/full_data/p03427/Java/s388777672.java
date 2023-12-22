import java.util.*;
import static java.lang.System.out;

import java.awt.image.IndexColorModel;
public class Main{
   static Scanner sc = new Scanner(System.in);
   public static void main(String[] args){
      long N = sc.nextLong();
      ArrayList<Integer> list = new ArrayList();
      String[] str = String.valueOf(N).split("");
      int length = str.length;
      int[] array = createInt(str,length);
      list.add(plusN(array,length));

      boolean flag = length == 1;
      for(int i=length-1;i>=0;i--){
         if(!flag && i != 0){
            array[i] = 9;
         }else{
            array[0] = array[0] - 1 ;
         }
         list.add(plusN(array,length));
      }
   

      int max = 0;
      for(int i=0;i<=length;i++){
         max = max < list.get(i) ? list.get(i) : max;
      }
     System.out.println(max);
   }
   static int[] createInt(String[] str,int length){
      int[] array = new int[length];
      int i = 0;
      for(String s: str){
         array[i++]  = Integer.parseInt(s);
      }
      return array;
   }
   static int plusN(int[] str,int length){
      int count = 0;
      for(int  s: str){
         count +=s;
      }
      return count; 
   }
}