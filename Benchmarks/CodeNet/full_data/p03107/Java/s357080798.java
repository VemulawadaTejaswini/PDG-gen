import java.util.*;
import java.io.*;

public class Main{
 public static void main(String[] args){
 Scanner s = new Scanner(System.in);
   String str = s.nextLine();
   int k;
   
   for(int i=0; i<str.length(); i++){
    if(str.charAt(i)=='0'){
    k++;
    }
   }
  System.out.print(Math.min(k, (int)str.length()-k));
   
 }
  
  
}