import java.util.Scanner; 
import java.util.Arrays;

class Main{

 public static void main(String[] args){

 Scanner scan = new Scanner(System.in);

 String S = scan.next();
 String[] split = S.split("");     
  
   
    if (split[2].equals(split[3])){
   if (split[4].equals(split[5])) {
   System.out.println("Yes");
 }
   else {
  System.out.println("No");
   }
 }
  else{ 
   System.out.println("No");
  }
 }
}