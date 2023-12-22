import java.util.*;

public class Main{
  
  public static void main (String[] args){
  
  	Scanner scanner = new Scanner (System.in);
  
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    
    int product = a*b;
    
    if (product%2 == 1){
      System.out.println("Odd");
    } else {
      System.out.println("Even");
    }
  }
}