import java.lang.*;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    Main m = new Main();
    m.exec();
  }

  private void exec() {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int a = scan.nextInt();
    int b = scan.nextInt();

    
    if (Math.abs(x - a) < Math.abs(x - b)) {
      System.out.println("A");
    } else {
      System.out.println("B");
    }
  }
}