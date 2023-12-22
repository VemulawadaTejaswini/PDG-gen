import java.util.Scanner;
 
public class Main {
  public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
   
  System.out.print("開始時刻");
  int a = scan.nextInt();
  System.out.print("経過時間");
  int b = scan.nextInt();
  scan.close();
 
  if((a + b) <= 24 ){
  System.out.println("終了時間は" + (a + b) + "時です"); 
   }
  	else if((a + b) >= 24){
  		System.out.println("もう一度");
  	}
 }
}