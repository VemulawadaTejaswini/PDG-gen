import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
	int a = scanner.nextInt();
    int b = scanner.nextInt();
    scanner.close();
    
    if(a % 2 == 0){
      System.out.print("Even");
        return;
    }
 
    if(b % 2 == 0){
      System.out.print("Even");
        return;
    }
    
    System.out.print("Odd");
  }

}