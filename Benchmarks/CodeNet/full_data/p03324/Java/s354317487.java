import java.util.*;

public class Main {

  private static final int MAX_COUNT = 999;

  public static void main(String[] args) {
    Main m = new Main();
    m.exec();
  }

  private void exec() {
    Scanner scan = new Scanner(System.in);

    int d = scan.nextInt();
    int n = scan.nextInt();
    
    int result = 0;
    switch(d) { 
      case 0:
        result = n;
        if (n = 100) {
          result++;
        }
      case 1:
        result = 100 * n;
        
      case 2:
        result = 10000 * n;
      default:
    }
    System.out.println(result);

    scan.close();
  }

}