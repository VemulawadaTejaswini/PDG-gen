import java.util.*;

public class Main {

  public static void main(String[] args) {
    Main m = new Main();
    m.exec();
  }

  private void exec() {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();

    int countA = 1;
    int countB = 0;
    int groupA = a;
    int groupB = 0;
    
    if (b == groupA) {
      countA++;
    } else {
      groupB = b;
      countB = 1;
    }
    if (c == groupA) {
      countA++;
    } else {
      groupB = c;
      countB++;
    }
    if (countA == 1) {
      System.out.println(groupA);
    } else {
      System.out.println(groupB);
    }
  }
}