import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int diff = A - 2*B;
    
    if(diff > 0){
      System.out.println(diff);
    } else {
      System.out.println(0);
    }
  }

}