import java.util.*;

public class Main{
  
  public static void main (String[] args){
  
  	Scanner scanner = new Scanner (System.in);
  
   	int A = scanner.nextInt();
    int B = scanner.nextInt();
    int C = scanner.nextInt();
    int D = scanner.nextInt();
    
    int left = A+B;
    int right = C+D;
    
    if (right > left){
      System.out.println("Right");
    } else if (right < left){
      System.out.println("Left");
    } else {
      System.out.println("Balanced");
    }
  }
}