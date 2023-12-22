import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	
      Scanner scan = new Scanner(System.in);
      String a = scan.next();
      for (i = 0 ; i < 4 ; i++){
        if (a.charAt(i-1) == a.charAt(i)){
        	System.out.println("bad");
        } else {
        	System.out.println("good");
        }
      }  
    }
}