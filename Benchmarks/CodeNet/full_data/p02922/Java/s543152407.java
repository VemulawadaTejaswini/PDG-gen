import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    
    int A = Integer.parseInt(line.split(" ")[0]);
    int B = Integer.parseInt(line.split(" ")[1]);
    
    int result = 0;
    while (true) {
      int tmp;
      if (result == 0) { tmp = 1; }
      else if (result == 1) { tmp = A; }
      else { tmp = A * result + (result - 1);  }
      
      if ( tmp >= B ) { break; }
      
      result++;
      
    }
    System.out.println(result);
  }
}
