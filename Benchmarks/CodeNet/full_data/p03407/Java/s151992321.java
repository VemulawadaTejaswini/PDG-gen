import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
      try {
      	Scanner scanner = new Scanner(System.in);
      	System.out.print("Input > ");

      	int x = scanner.nextInt();
     	int y = scanner.nextInt();
		int z = scanner.nextInt();
      	scanner.close();
        if (x+y >= z){
       	    System.out.println("YES");
        }else{
         	System.out.println("NO");
        }
    } catch (InputMismatchException e) { 
      System.out.println("error");
    }
      
    }
}