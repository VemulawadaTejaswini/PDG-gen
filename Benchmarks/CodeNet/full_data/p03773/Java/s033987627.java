import java.util.Scanner;
 
public class Main {
  public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
   
  
  int A = scan.nextInt();
  int B = scan.nextInt();
  scan.close();
 
  if((A + B) >= 0 && (A + B) <= 23 ){
  System.out.println(A + B); 
   }
  	else if((A + B) < 0 || (A + B) >= 24){
  	 System.out.println((A + B - 24));
  }
 }
}