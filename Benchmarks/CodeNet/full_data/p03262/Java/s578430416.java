import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class ABC109C {
  public static void main(String[] args) {
    System.out.println("start");
    new ABC109C().exec();
    System.out.println("end");
  }

  void exec() {
    Scanner sc = new Scanner(System.in);
    int n = readInt(sc);
    int x = readInt(sc);
    int xs[] = new int[n];
    for (int i = 0; i < n; i++) {
      xs[i] = Math.abs(x - readInt(sc));
    }

    int beforeG = x;
    for (int i = 0; i < n; i++) {
      if (i == 0)
        beforeG = gcb(xs[i], xs[i + 1]);
      else
        beforeG = gcb(beforeG, xs[i]);
    }
    System.out.println(beforeG);
  }

  int gcb(int a, int b) {
    if (b == 0) {
      return a;
    } else {
      return gcb(b, a % b);
    }
  }

  int readInt(Scanner sc) {
    return sc.nextInt();
  }

  String readString(Scanner sc) {
    return sc.next();
  }

}