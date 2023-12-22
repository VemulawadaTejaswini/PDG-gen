import java.util.*;
import java.io.*;

public class Main{
 public static void main(String[] args){
 Scanner s = new Scanner(System.in);
   String str = s.nextLine();
   int k= str.length();
   
   while(str.contains("01")|| str.contains("10")){
   str = str.replaceAll("01","");
     str = str.replaceAll("10","");
   }
  
   int f = k- str.length();
   System.out.print(f);
   
 }
  
  
}