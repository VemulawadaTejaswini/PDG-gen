import java.util.*;

public class Main {

 public static void main(String args[]) {

  Scanner sc = new Scanner(System.in);
  String s = sc.next();
  String[] a = s.split("");
  long k = sc.nextInt();
   
   int len = a.length;

   
   long result = 0;

   
   if(len == 1){
     result = k/2;
   }
   else
   {
     
     boolean flg = true;
     boolean firstFlg = true;
     int firstCount = 0;
     int count = 1;
     for (int i = 1; i < len;){
       count = 1;
       flg = true;
         
       while(flg){
       
         if(a[i - 1].equals(a[i])){
           count++;
           if(len - 1 == i){
             result += (count/2) * k;
             flg = false;
           }
         }else{
           result += (count/2) * k;
           flg = false;
         }
         
         i++;
       } 
       
       if(firstFlg){
         firstCount = count;
         firstFlg = false;
       }
     }
     
       
     if(count % 2 == 1 && firstCount % 2 == 1)
     {  
       String f = a[0];
       String l = a[len - 1];
     
       if (f.equals(l)){
         result += k - 1;
       }
     }
     
   }
     System.out.println(result);
 }
}