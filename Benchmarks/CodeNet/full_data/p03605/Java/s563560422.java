import java.io.*;

class Main{
 public static void main(Sttring[] args){
  
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
   try{
   String str = br.readLine();
   int num = Integer.parseInt(str);
   
   if( num % 9 ==1){
     System.out.println("Yes");
   }else{
     System.out.println("No");
   }catch(Exception){
   }
 }
}