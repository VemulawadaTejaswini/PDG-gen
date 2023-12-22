import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
        int a  = keyboard.nextInt();
		String S  = keyboard.next();
        int b  = keyboard.nextInt();

           if(S.equals("+")){
              System.out.println(a+b);
           }else{
              System.out.println(a-b);
           }
  }
}