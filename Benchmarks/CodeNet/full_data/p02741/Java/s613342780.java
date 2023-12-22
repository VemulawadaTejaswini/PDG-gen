import  java.io.*;
public class Main {
   public static void main(String argv[]){
       int ka[] = {1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51};
       try{
       String s = new String(new BufferedReader(new InputStreamReader(System.in)).readLine());
System.out.println(s);
System.out.println(
ka[Integer.valueOf(s)-1]);
      }catch(Exception e){
         e.printStackTrace();
     }
   }
}