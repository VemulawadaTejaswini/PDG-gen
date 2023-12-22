import java.util.*;

public class Main {

  private static final int MAX_COUNT = 999;

  public static void main(String[] args) {
    Main m = new Main();
    m.exec();
  }

  private void exec() {
    Scanner scan = new Scanner(System.in);

    int a = scan.nextInt();
    int b = scan.nextInt();
    

    for (int i = 0; i < MAX_COUNT - 1; i++) {
      int aSnow = getHeight(i, 0) - a;
      int bSnow = getHeight(i + 1, 0) - b;
      if (aSnow == bSnow) {
        System.out.println(aSnow);
        break;
      }
    }
    scan.close();
  }

  private int getHeight(int index, int length) {
    if (index < 0) {
      return length;
    } else {
      return getHeight(index - 1, length + index + 1);
    }
  }
}