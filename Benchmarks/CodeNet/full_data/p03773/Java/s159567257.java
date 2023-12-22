import java.util.Scanner;
 
public class Main {
  public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
   
  System.out.print("開始時刻");
  int A = scan.nextInt();
  System.out.print("経過時間");
  int B = scan.nextInt();
  scan.close();
 
  if((A + B) <= 24 ){
  System.out.println("終了時間は" + (A + B) + "時です"); 
   }
  	else if((A + B) >= 24){
  		System.out.println("もう一度");
  	}
 }
}