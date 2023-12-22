import java.util.Scanner;
 
public class Main{
	public static void main(String[] args){
    	
      Scanner scan = new Scanner(System.in);
      String a = scan.next();
      if (a.charAt(0) == a.charAt(1) || a.charAt(1) == a.charAt(2) || a.charAt(2) == a.charAt(3)){
        System.out.print("Bad");
      }else{
        System.out.print("Good");
      }
    }
}