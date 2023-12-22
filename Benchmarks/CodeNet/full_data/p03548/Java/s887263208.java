import java.util.*;

public class Main {

  public static void main(String[] args) {
    Main m = new Main();
    m.exec();
  }

  private void exec() {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int y = scan.nextInt();
    int z = scan.nextInt();

    int count = 0;
    int width = 0;
    
    while (true) {
      width = (count + 1) * z + count * y;
      if (width >= x) {
        break;
      }
      count++;
    }
    System.out.println(z);
  }
}