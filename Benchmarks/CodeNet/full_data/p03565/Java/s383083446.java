import static java.lang.System.out;
import java.util.Scanner;
import java.util.Arrays;
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in); 
      char[] str = sc.next().toCharArray();
      String aaa = sc.next();
      char[] target = aaa.toCharArray();
      boolean check = false;
      StringBuilder result = new StringBuilder(); 
      

   try{
      for(int i=0;i<str.length;i++){
         int k = i+1;
         if(str[i] == target[0]){
            for(int j = 1;j<target.length;j++){
               if(str[k]=='?' || str[k] == target[]){
                  if(j==target.length-2){
                     result.append(aaa);
                     check = true;
                     i += target.length;
                  }
                  k++;
               }else{
                  result.append(str[i]);
                  break;
               }
            }
         }else if(str[i]== '?'){
               result.append('a');
         }else{
            result.append(str[i]);
         }
      }
   }catch(ArrayIndexOutOfBoundsException e){

   }
   if(check){
      out.println(result);
   }else{
      out.println("UNRESTORABLE");
   }
      
   } 
}