import java.util.*;

public class Main {

  public static void main(String[] args) {
    Main m = new Main();
    m.exec();
  }

  private void exec() {
    Scanner scan = new Scanner(System.in);
	int count5 = 0;
    int count7 = 0;
    for (int i = 0; i < 3; i++) {
      switch (scan.nextInt()) {
        case 5:
          count5++;
          break;
        case 7:
          count7++;
          break;
        default:
      }
    }
    if (count5 == 2 && count7 == 1) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

    scan.close();
  }
}